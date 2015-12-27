package org.gaurav.restws.test.integration;

import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.gaurav.restws.vo.Customers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse.Status;

public class CustomerResourceIntegrationTest {

	protected final static String Resource_URI = "http://localhost:8083";
	private static Client client;
	private static WebTarget target;
	private WebTarget target1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = ClientBuilder.newClient();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		client.close();
	}

	@Before
	public void setUp() throws Exception {
		target = client.target(Resource_URI).path("Jersey-Spring-Integration/customers");
		target1 = target.path("/{id}");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void checkCustomersNoResourceFound()
	{
	 WebTarget targetNothing = client.target(Resource_URI);
	 Response response = targetNothing.request().get();
	 assertEquals(404, response.getStatus());
	}
	
	@Test
	public void checkGetAllCustomersResponseOK() {
		Response response = target.request().get();
		assertEquals(200, response.getStatus());
	}

	@Test
	public void checkGetOneCustomerResponseOK() {
		target1 = target1.resolveTemplate("id", 5);
		Response response = target1.request().get();
		assertEquals(200, response.getStatus());
	}
	
	@Test
	public void checkGetOneCustomerResponseNot_Found() {
		target1 = target1.resolveTemplate("id", 3);
		Response response = target1.request().get();
		assertEquals(500, response.getStatus());
	}

	@Test
	public void checkGetOneCustomerResponseContents() {
		target1 = target1.resolveTemplate("id", 2);
		Customers responseCust = target1.request().get(Customers.class);
		assertEquals(2, responseCust.getCustomerID());
		assertEquals("Anu", responseCust.getFirstName());
		assertEquals("Kandalkar", responseCust.getLastName());
	}

	@Test
	public void checkPostCustomerResponse() {
		Customers newCust = new Customers();
		newCust.setFirstName("Vedant");
		newCust.setLastName("Ambadkar");
		Customers responsecustomers = target.request().post(Entity.entity(newCust, MediaType.APPLICATION_JSON),
				Customers.class);
		assertNotNull(responsecustomers.getCustomerID());

	}

	@Test
	public void checkPutCustomerResponse() {
		Customers newCust = new Customers();
		newCust.setCustomerID(1);
		newCust.setFirstName("Vedant");
		newCust.setLastName("Ambadkar");
		Customers responsecustomers = target.request().put(Entity.entity(newCust, MediaType.APPLICATION_JSON),
				Customers.class);
		assertEquals(newCust.getFirstName(), responsecustomers.getFirstName());
	}

}

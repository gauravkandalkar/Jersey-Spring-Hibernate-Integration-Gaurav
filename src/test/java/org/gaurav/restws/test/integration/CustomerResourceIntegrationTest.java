package org.gaurav.restws.test.integration;

import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.gaurav.restws.vo.Customers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		target1 = target.path("/{id}").resolveTemplate("id", 1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void checkGetAllCustomersResponseOK() {
	Response response = target.request().get();
		assertEquals(200, response.getStatus());
	}

	@Test
	public void checkGetOneCustomerResponseOK()
	{
		Response response = target1.request().get();
		assertEquals(200, response.getStatus());
	}

	@Test
	public void checkGetOneCustomerResponseContents()
	{
		Customers responseCust  = target1.request().get(Customers.class);
		assertEquals(1, responseCust.getCustomerID());
		assertEquals("Gaurav", responseCust.getFirstName());
		assertEquals("Kandalkar", responseCust.getLastName());
	}
}

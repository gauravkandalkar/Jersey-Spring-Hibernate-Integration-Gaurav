package org.gaurav.restws.test.integration;

import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerResourceIntegrationTest {

	protected final static String Resource_URI = "http://localhost:8083";
	private static Client client;
	private static WebTarget target;

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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	Response response = target.request().get();
		assertEquals(200, response.getStatus());
	}

}

package client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import webservice.CustomerDomain;

public class SimpleClientTest {

	SimpleClient client;
	
	@Before
	public void setUp(){
		client = new SimpleClient();
	}
	
	@Test
	public void testGetMarks() {
		List<String> marks = client.getMarks();
		assertNotNull(marks);
	}
	
	@Test
	public void testGetCustomer() {
		CustomerDomain customer = client.findCustomerByPassport("9100", "100101");
		assertNotNull(customer);
	}

}

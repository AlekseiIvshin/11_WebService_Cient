package client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import webservice.CustomerDomain;

public class ClientTest {

	Client client;
	
	@Before
	public void setUp(){
		client = new Client();
	}
	
	@Test
	public void testGetCustomerByPassport() {
		CustomerDomain customer = client.getCustomerByPassport("9100", "100100");
		assertNotNull(customer);
	}
	
	@Test
	public void testGetCarMarks() {
		List<String> marks = client.getCarMarks();
		assertNotNull(marks);
	}

}

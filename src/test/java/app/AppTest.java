package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	App app;
	
	@Before
	public void setUp(){
		app = new App();
	}
	
	@Test
	public void testCreateReports() {
		try {
			app.createReports();
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
}

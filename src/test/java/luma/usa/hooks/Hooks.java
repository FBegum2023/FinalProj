package luma.usa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.usa.basepage.SuperClass;
//import luma.usa.elementPage.PageFactoryElements;

public class Hooks extends SuperClass{
	@Before
	public void setUp() throws InterruptedException {
		
		System.out.println("======Automation Started=========");
		initialization();
		
	}
	@After
	public void tearDown() {
		System.out.println("======Automation completed and closed the browser=========");
	driver.quit();
	}
	

}

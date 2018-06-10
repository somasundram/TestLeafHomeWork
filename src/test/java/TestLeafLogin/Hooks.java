package TestLeafLogin;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
	//public String browserName;
	
	@Before
	public void before(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("Somu");
		startApp("chrome");	
	}
	
	@After
	public void after(Scenario sc)
	{
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
		closeAllBrowsers();
		endResult();
	}

}

package TestLeafLogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CreateLeadCucu {
	
	public static RemoteWebDriver driver;
	
	@Given("invoke LeafTap Application")
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".driverschromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:leaftaps.comopentapscontrolmain");
	}
	
/*	@And("Enter the UserName as (.*)")
	public void enterUsername(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("Click on login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click crmsfa link")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRMSFA").click();
	}
	
	@And("click leads tab")
	public void clickLeadsTab()
	{
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("click createlead link")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the Company Name")
	public void enterCname()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("TESTLEAF");
	}
	
	@And("Enter the First Name")
	public void enterFname()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Test");
	}
	
	@And("Enter the Last Name")
	public void enterLname()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("leaf");
	}
	
	@When("click the CreateLead button")
	public void clickSubmit()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Verify the CreateLead Successfull")
	public void verifySubmit()
	{
		System.out.println("Submitted Successfully");
	}*/
}

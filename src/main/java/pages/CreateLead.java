package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCName;
		
	@And("Enter the Company Name")
	public CreateLead typeCName(String data) {
		type(eleCName,data);
		return this;
	}
		@FindBy(how=How.ID,using="createLeadForm_firstName")
		private WebElement elefName;
			
		@And("Enter the First Name")
		public CreateLead typeFName(String data) {
			type(eleCName,data);
			return this;
		}	
		@FindBy(how=How.ID,using="createLeadForm_companyName")
		private WebElement eleLName;
			
		@And("Enter the Last Name")
		public CreateLead typeLName(String data) {
			type(eleCName,data);
			return this;
		}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement elesmallSubmit;
		
		@When("click the CreateLead button")
		public ViewLead clickViewLeads() {
			click(elesmallSubmit);
			return new ViewLead();
}
}

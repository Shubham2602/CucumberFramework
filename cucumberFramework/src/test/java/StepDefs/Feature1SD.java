package StepDefs;

import org.framework.cucumberFramework.TestClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;;

public class Feature1SD {

	public String name;
	public String id;
	public String company;
	
	TestClass testClass = new TestClass();
	
	@Given("^name is \"([^\"]*)\", id is \"([^\"]*)\" and company is \"([^\"]*)\"$")
	public void name_is_id_is_and_company_is(String name, String id, String company) throws Throwable {
		this.name = name;
		this.id = id;
		this.company = company;
	}

	@When("^get method is called\\.$")
	public void get_method_is_called() throws Throwable {
		testClass.setName("Shubham");
		testClass.setId("112");
		testClass.setCompany("Accenture");
	}

	@Then("^name, id and company matches$")
	public void name_id_and_company_matches() throws Throwable {
		Assert.assertEquals(name, testClass.getName());
		Assert.assertEquals(id, testClass.getId());
		Assert.assertEquals(company, testClass.getCompany());
	}
}

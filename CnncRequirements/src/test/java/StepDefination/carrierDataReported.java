package StepDefination;

import io.cucumber.java.en.*;

public class carrierDataReported {

	//given
	@Given("^(.*) hass been reported to the carrier$")
	public void Data_has_been_reported_to_the_carrier (String data)
	{
		System.out.println("data Reported for "+data);
	}

	@When("^Data is updated in the (.*) table$")

	public void Data_is_updated_in_the_PED_table(String required) 
	{
		System.out.println("data updated in the table"+required);
	}

	
	@Then("^Will get the confirmation$")
	public void Will_get_the_confirmation()
	{
		System.out.println("get confirmation from carrier");
	}

}

package StepDefination;

import io.cucumber.java.en.*;

public class StepDefination {

	   @Given("^Open the site Url$")
	   public void Open_the_Site_url() 
	   {
		   System.out.println("Site Opened Successfully");
		   
	   }
	   
	    @When ("^Correct Creditientials are provided$")
	    
	    public void Correct_Creditientials_are_provided() {
	    	System.out.println("creditientials acceppted");
	    }
	    
	    @Then ("^Login successfully$")
	    
	    	public void Login_successfully() {
	    	System.out.println("Login Successfully");
	    }
	    
	    
}

package Stepdefinition;

import org.openqa.selenium.WebDriver;
import Bikewala.Bikewala1;
import base.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition1 {
	
	WebDriver driver = Hook.getDriver();
	Bikewala1 bw = new Bikewala1(driver);
	
	
	@Given("enter into bikewala")
	public void enter_into_bikewala() {
		
	}

	
	@Given("I want to search passion plus bike in search box")
	public void i_want_to_search_passion_plus_bike_in_search_box() {
	    bw.passionplusbike();
	    
	}
	@Given("click and print bike overview")
	public void click_and_print_bike_overview() {
	    
	}
	
	
	@Then("go to price details and print")
	public void go_to_price_details_and_print() throws InterruptedException {
		bw.price();
	    Thread.sleep(5000);
	    
	}
	@Then("go to mileage details and print")
	public void go_to_mileage_details_and_print() throws InterruptedException {
		bw.mileage();
		Thread.sleep(3000);
	    
	    
	}
	
	@Then("print the specs and features")
	public void print_the_specs_and_features() throws InterruptedException {
		bw.specs();
		Thread.sleep(3000);
		
		bw.features();
		Thread.sleep(3000);
	}
	  

	
	
}





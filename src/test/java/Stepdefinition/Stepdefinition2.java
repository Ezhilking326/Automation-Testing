package Stepdefinition;

import org.openqa.selenium.WebDriver;
import Bikewala.Bikewala2;
import base.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;

public class Stepdefinition2 {
	WebDriver driver = Hook.getDriver();
	Bikewala2 bw = new Bikewala2(driver);
	
	@Given("navigates to home page")
	public void navigate_to_home_page() throws InterruptedException {
		bw.homepage();
		Thread.sleep(2000);
	}
	

	@Given("select find new bikes from menu")
	public void select_find_new_bikes_from_menu() throws InterruptedException {
	    bw.findbike();
	    Thread.sleep(3000);
	}



	@Then("view brand and click ola")
	public void view_brand_and_click_ola() throws InterruptedException {
	    bw.brandselect();
	    Thread.sleep(2000);
	}
	
	@Then("filter by budget and price range")
	public void filter_by_budget_and_price_range() throws InterruptedException {
	   bw.filterby();
	   Thread.sleep(2000);
	}
	
	
	@Then("change body style as scooter")
	public void change_body_style_as_scooter() throws InterruptedException {
		bw.bodystyle();
		Thread.sleep(2000);
	    
	}
	
	
	@Then("apply filter and print all bike under one lakh")
	public void apply_filter_and_print_all_bike_under_one_lakh() throws InterruptedException {
		bw.applyfilter();
		Thread.sleep(4000);
		bw.list();
	}




		
}

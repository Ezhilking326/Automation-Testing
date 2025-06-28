package Stepdefinition;

import org.openqa.selenium.WebDriver;

import Bikewala.Bikewala3;
import base.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition3 {
	WebDriver driver = Hook.getDriver();
	Bikewala3 bw = new Bikewala3(driver);
	
	@Given("select find new scooter from menu")
	public void select_find_new_scooter_from_menu() throws InterruptedException {
	    bw.findScooter();
	    Thread.sleep(2000);
	}
	
	@Then("filter by values")
	public void filter_by_values() throws InterruptedException {
		bw.filterBy();
		Thread.sleep(2000);
	}
	
	@Then("apply filter and print all scooters")
	public void apply_filter_and_print_all_scooters() throws InterruptedException {
	    bw.applyFilter();
	    Thread.sleep(4000);
	}



}

package Bikewala;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bikewala1 extends Basepage{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	
	public Bikewala1(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="(//input[@type=\"text\"])[1]")
	WebElement passionplusbike;
	
	@FindBy(xpath="(//div[@class=\"o-C o-o o-oz o-os b5G7MI   o-hl\"])[2]")
	WebElement price;
	
//	@FindBy(xpath="(//div[@class=\"o-C o-o o-oz o-os b5G7MI   o-hl\"])[6]")
//	WebElement mileage;
	
	@FindBy(xpath="//span[@title='Hero Passion Plus Mileage']")
	WebElement mileage;
	
//    @FindBy(xpath="(//div[@class=\"o-C o-o o-oz o-os b5G7MI  o-hl\"])[2]")
//    WebElement specs;

	
	

	public void passionplusbike(){
		wait.until(ExpectedConditions.elementToBeClickable(passionplusbike));
		passionplusbike.click();
		passionplusbike.sendKeys("Hero passion plus");
		driver.navigate().to("https://www.bikewale.com/hero-bikes/passion-plus/");
		
	}
	
	public void price() {
		wait.until(ExpectedConditions.elementToBeClickable(price));
		price.click();
		Actions a=new Actions(driver);
		a.moveToElement(price).perform();
		
	}
	public void mileage() {
		try {
			

			wait.until(ExpectedConditions.elementToBeClickable(mileage));

			// Scroll the element into view using JavaScript (with vertical offset)
			((JavascriptExecutor) driver).executeScript(
			    "arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", mileage);
			Thread.sleep(800); // Allow for scroll animation

			// Now click using JavaScript to avoid interception
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", mileage);

			// Hover effect after click
			new Actions(driver).moveToElement(mileage).perform();

			System.out.println("Mileage clicked and hovered successfully.");
		} catch (Exception e) {
			System.out.println("Mileage click failed: " + e.getMessage());
		}
	}
	
	public void specs() {
	    By specsLocator = By.xpath("(//div[@class='o-C o-o o-oz o-os b5G7MI  o-hl'])[2]");

	    int maxRetries = 3;
	    int attempts = 0;

	    while (attempts < maxRetries) {
	        try {
	            WebElement freshSpecs = wait.until(ExpectedConditions.elementToBeClickable(specsLocator));

	            // Move to the element before clicking — sometimes helps avoid staleness
	            new Actions(driver).moveToElement(freshSpecs).perform();

	            // Now click the element
	            freshSpecs.click();
	            break; // success, so break the loop

	        } catch (StaleElementReferenceException e) {
	            System.out.println("Attempt " + (attempts + 1) + ": StaleElementReferenceException caught. Retrying...");
	            attempts++;
	            // small wait can help stabilize DOM
	            try {
	                Thread.sleep(500); 
	            } catch (InterruptedException ignored) {}
	        } catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	            break; // break on any non-stale error
	        }
	    }

	    if (attempts == maxRetries) {
	        throw new RuntimeException("Failed to click on specs after multiple retries due to stale element.");
	    }
	}
	
	
	public void features() {
	    By featuresLocator = By.xpath("(//div[@class=\"o-C o-o o-oz o-os b5G7MI  o-hl\"])[3]");

	    int maxRetries = 3;
	    int attempts = 0;

	    while (attempts < maxRetries) {
	        try {
	            WebElement freshFeatures = wait.until(ExpectedConditions.elementToBeClickable(featuresLocator));

	            // Move to the element before clicking — sometimes helps avoid staleness
	            new Actions(driver).moveToElement(freshFeatures).perform();

	            // Now click the element
	            freshFeatures.click();
	            break; // success, so break the loop

	        } catch (StaleElementReferenceException e) {
	            System.out.println("Attempt " + (attempts + 1) + ": StaleElementReferenceException caught. Retrying...");
	            attempts++;
	            // small wait can help stabilize DOM
	            try {
	                Thread.sleep(500); 
	            } catch (InterruptedException ignored) {}
	        } catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	            break; // break on any non-stale error
	        }
	    }

	    if (attempts == maxRetries) {
	        throw new RuntimeException("Failed to click on features after multiple retries due to stale element.");
	    }
	}
	

}

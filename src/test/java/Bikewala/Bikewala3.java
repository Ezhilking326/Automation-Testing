package Bikewala;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bikewala3 extends Basepage {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	
	public Bikewala3(WebDriver driver) {
		super(driver);
	}
	
	
	public void findScooter() throws InterruptedException {
		Thread.sleep(2000);
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class=\"header__menu-icon\"]")));
        menu.click();
        Thread.sleep(1000);
        
        WebElement newScooter = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-jr o-jJ o-j3 o-cE\"])[3]")));
        newScooter.click();
        Thread.sleep(1000);
        
        WebElement selectNewScooter = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(text(),'New Scooter')])[2]")));
        selectNewScooter.click();
        
	}
	
	public void filterBy() throws InterruptedException {
		WebElement brand = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(text(), 'Brand')])[1]")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'})", brand);
		Thread.sleep(1000);
	
        brand.click();
        Thread.sleep(1000);
        
        
        WebElement brandName = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-d o-j o-jK  o-c4 o-cA\"])[2]")));
        brandName.click();
        Thread.sleep(2000);
        
        WebElement startType = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-f o-os o-oz o-aE o-cA o-dN o-c4 o-dh o-bQ o-cm\"])[2]")));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'})", startType);
        Thread.sleep(1000);
        startType.click();
        Thread.sleep(1000);
        
        WebElement startTypeValue = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-d o-j o-jK  o-c4 o-cA\"])[58]")));
        startTypeValue.click();
        Thread.sleep(2000);
        
        WebElement budget = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-f o-os o-oz o-aE o-cA o-dN o-c4 o-dh o-bQ o-cm\"])[3]")));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'})", budget);
        Thread.sleep(1000);
        budget.click();
        Thread.sleep(1000);
        
        WebElement slider = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//button[@role=\"slider\"])[2]")));
        slider.click();
        Thread.sleep(1000);
       
        WebElement priceRange = wait.until(ExpectedConditions.visibilityOfElementLocated(
        	    By.xpath("//input[@placeholder=\"Max\"]")));
        priceRange.click();
        Thread.sleep(1000);
        
        priceRange.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        priceRange.sendKeys(Keys.BACK_SPACE);
        
        priceRange.sendKeys("200000");
        Thread.sleep(2000);
        
        
        WebElement brakeType = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-f o-os o-oz o-aE o-cA o-dN o-c4 o-dh o-bQ o-cm\"])[5]")));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'})", brakeType);
        Thread.sleep(1000);
        brakeType.click();
        Thread.sleep(1000);
         
        WebElement brakeTypeValue = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-d o-j o-jK  o-c4 o-cA\"])[59]")));
        brakeTypeValue.click();
        Thread.sleep(2000);
        
        WebElement wheels = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-f o-os o-oz o-aE o-cA o-dN o-c4 o-dh o-bQ o-cm\"])[7]")));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'})", wheels);
        Thread.sleep(1000);
        wheels.click();
        Thread.sleep(1000);
        
        WebElement wheelType = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-d o-j o-jK  o-c4 o-cA\"])[67]")));
        wheelType.click();
        
        
	}
	
	public void applyFilter() {
		WebElement apply = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class=\"o-g o-aE o-aL o-kJ o-ox o-ku o-nc  o-hl  o-mf o-lT   o-ik o-j2 o-ji o-jq u74LDI o-lk o-jI o-mS o-cF o-c9 \"]")));
        apply.click();
        
        // print the filtered result
        List<WebElement> li = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
        	    By.xpath("//div[@class=\"o-bK\"]")));
        System.out.println("Filtered scooter list- "+ li.size());
		
		for(int i=0;i<li.size();i++) {
			System.out.println("=======================================================");
			System.out.println(li.get(i).getText());
			
		} 
    	
	}
	
}

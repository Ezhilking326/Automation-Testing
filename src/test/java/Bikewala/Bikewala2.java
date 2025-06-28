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


public class Bikewala2 extends Basepage{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	
	public Bikewala2(WebDriver driver) {
		super(driver);
	}
	
	
	public void homepage() {
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class='header__menu-icon']")));
        menu.click();

        WebElement home = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='o-jr o-jJ o-j3 o-cE'])[1]")));
        home.click();
	}
	
	public void findbike() {
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class='header__menu-icon']")));
        menu.click();
		
		WebElement newBike = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-jr o-jJ o-j3 o-cE\"])[2]")));
        newBike.click();

        WebElement findNewBike = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class=\"o-jr o-jJ o-j1 \"])[1]")));
        findNewBike.click();
	}
	
	public void brandselect() throws InterruptedException {
		WebElement brand = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class=\"o-os o-f o-aE o-aL  o-j2 o-jq o-jJ o-c o-jE o-kg o-j3 o-j3 o-bQ o-d3 o-cm o-dz o-mi o-lT o-mO o-n5 \"]")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'})", brand);

        Thread.sleep(1000);
        brand.click();
        
        WebElement ola = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//li[@class=\"o-bS o-co o-cy o-c2 o-jE _FSGie o-lT o-mO o-n5 o-ml  o-mo \"])[36]")));
        
		js.executeScript("arguments[0].scrollIntoView({block: 'center'})", ola);

        Thread.sleep(1000);
        ola.click();
        
	}
	
	
	public void filterby() throws InterruptedException {
		WebElement budget = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-C o-o o-oz o-os b5G7MI o-C o-o o-os o-oz o-mf o-j1 o-jh o-lT   o-bQ o-cm o-cE o-c8 o-g  o-aF I3QZzs   o-jJ o-mL o-nc o-kY o-bQ o-cm o-j3 o-eB \"])[1]")));
        budget.click();
        Thread.sleep(2000);
        
        WebElement slider = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//button[@role='slider'])[2]")));
        slider.click();
       
        WebElement priceRange = wait.until(ExpectedConditions.visibilityOfElementLocated(
        	    By.xpath("(//input[@placeholder='Max'])[1]")));
        priceRange.click();
        
        priceRange.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        priceRange.sendKeys(Keys.BACK_SPACE);
        
        priceRange.sendKeys("100000");

	}
	
	public void bodystyle() throws InterruptedException {
		WebElement bodyStyle = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div[@class=\"o-f o-aE o-ie o-gT o-eg o-eO o-f7 o-ex  o-j1 o-jK\"])[2]")));
        bodyStyle.click();
        Thread.sleep(1000);
        
        WebElement scooter = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='Scooter']")));
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", scooter);
        scooter.click();
		   
	}
	
	public void applyfilter() throws InterruptedException {
		WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//button[@type=\"button\"])[16]")));

        applyButton.click();
        Thread.sleep(1000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, window.innerHeight/2)");
        
	}
	public void list() {
		List<WebElement> li = driver.findElements(By.xpath("//div[@class=\"o-gr o-fT o-hA Phu9vg o-df o-dL \"]"));
		int a=li.size();
		System.out.println(a);

		for(WebElement s:li) {
			System.out.println("=======================================================");
			System.out.println(s.getText());
			
	}
}
	
}

  


package practiceseven.libs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import practicefour.ParseProperties;
//import practicefour.Wait;
//import practicejava.CustomException;

public class Do {

	private WebDriver driver;
	//private Wait waiter;
	
	public Do(WebDriver driver){
		this.driver = driver;	
	//	waiter = new Wait(driver);
	}
	
	public WebElement what(String locator) {
		WebElement we=null;
		try{
			//this.waitForElementPresent(locator);
			we = driver.findElement(By.xpath(locator));
	     }catch(NoSuchElementException e){
		    System.out.println("-----:(-----");
	    }
		return we;
	}
	
	public List<WebElement> whats(String locator){
		return driver.findElements(By.xpath(locator));
	}
//	
//	public void waitForElementPresent(String locator){
//		waiter.waitForElementPresent(locator);
//	}
//	
//	public void waitForElementIsEnable(String locator){
//		waiter.waitForElementIsEnable(locator);
//	}
	
	
	public WebElement whatCSS(String locator) {
		WebElement we=null;
		try{
			//this.waitForElementPresent(locator;
			we = driver.findElement(By.cssSelector(locator));
	     }catch(NoSuchElementException e){
		    System.out.println("-----:(-----");
	    }
		return we;
	}
	
	
//	public void waitFor(long timeout){
//		waiter.waitFor(timeout);
//	}
//	
}

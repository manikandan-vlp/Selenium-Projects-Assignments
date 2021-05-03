package learn.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executors {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement sr = driver.findElementByName("q");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='software testing'", sr);
		
		//
		
	//	String test = (String) js.executeScript("return arguments[0].value", js);
		
	//	System.out.println(test);
		
		
		WebElement but = driver.findElementByXPath("//*[contains(text(),'Sign in')]");
		
		js.executeScript("arguments[0].click();", but);
	}

}

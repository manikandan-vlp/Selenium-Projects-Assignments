package week4.day1.assigments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableAUI2 {

	public static void main(String[] args) throws InterruptedException {

		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			//WebElement mens = driver.findElementByXPath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[7]/a/span");

			WebElement item1 = driver.findElementByXPath("(//option[text()='Select your programs'])/following::option[1]");
			WebElement item2 = driver.findElementByXPath("(//option[text()='Select your programs'])/following::option[2]");
			WebElement item3 = driver.findElementByXPath("(//option[text()='Select your programs'])/following::option[3]");
			WebElement item4 = driver.findElementByXPath("(//option[text()='Select your programs'])/following::option[4]");
			
			Actions builder = new Actions(driver);

		    builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item2).click(item4).keyUp(Keys.CONTROL).perform();


		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

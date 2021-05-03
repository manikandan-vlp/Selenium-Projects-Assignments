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

public class SnapdealAUIAssignment {

	public static void main(String[] args) throws InterruptedException {

		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.snapdeal.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			WebElement mens = driver.findElementByXPath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[7]/a/span");

			Actions builder = new Actions(driver);

			builder.moveToElement(mens).perform();
			Thread.sleep(1000);

			driver.findElementByXPath("//span[contains(text(),'Shirts')])[1]").click();

			/*
			 * Thread.sleep(2000);
			 * 
			 * WebElement from = driver.findElementByXPath("//input[@id='txtStationFrom']");
			 * from.clear(); from.sendKeys("ms"); from.sendKeys(Keys.TAB);
			 * 
			 * WebElement to = driver.findElementByXPath("//input[@id='txtStationTo']");
			 * to.clear(); to.sendKeys("mdu"); to.sendKeys(Keys.TAB);
			 * 
			 * WebElement sortbut = driver.findElementById("chkSelectDateOnly");
			 * sortbut.click(); List<WebElement> data = driver.
			 * findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr"
			 * ); int count = data.size();
			 * 
			 * ArrayList<String> trainname = new ArrayList<String>(); for (int i = 1; i <=
			 * count; i++) { String val = driver.
			 * findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["
			 * +i+"]/td[2]").getText(); trainname.add(val); }
			 * 
			 * LinkedHashSet<String> trainname2 = new LinkedHashSet<String>(trainname);
			 * 
			 * System.out.println(trainname);
			 * 
			 * System.out.println(trainname2);
			 */

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

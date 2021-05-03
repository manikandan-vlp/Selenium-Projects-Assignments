package week4.day1.assigments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErainAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElementByXPath("//input[@id='txtStationFrom']");
		from.clear();
		from.sendKeys("ms");
		from.sendKeys(Keys.TAB);

		WebElement to = driver.findElementByXPath("//input[@id='txtStationTo']");
		to.clear();
		to.sendKeys("mdu");
		to.sendKeys(Keys.TAB);

		WebElement sortbut = driver.findElementById("chkSelectDateOnly");
		sortbut.click();	
		List<WebElement> data = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int count = data.size();
		
		ArrayList<String> trainname = new ArrayList<String>();	
		
		for (int i = 1; i <= count; i++) {
			 String val = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			 trainname.add(val);
		}
		
		LinkedHashSet<String> trainname2 = new LinkedHashSet<String>(trainname);
		
		System.out.println(trainname);
		
		System.out.println(trainname2);
		
	}

}

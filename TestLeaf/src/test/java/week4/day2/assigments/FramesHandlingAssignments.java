package week4.day2.assigments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingAssignments {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("Manikandan");
		Thread.sleep(1000);
		alert.accept();

		String value = driver.findElementByXPath("//p[@id='demo']").getText();
		if (value.contains("Mani")) {

			System.out.println("Mani is present");

		} else {

			System.out.println("Mani isn't present");

		}
		
		Thread.sleep(1000);
		
		driver.quit();

	}
}

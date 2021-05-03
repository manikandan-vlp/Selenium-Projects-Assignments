package week4.assigments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();

		Set<String> allWindow = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(allWindow);
		String openWindow = childWindow.get(1);
		driver.switchTo().window(openWindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		String text = driver.findElement(By.xpath("//h1[@class='wp-heading']")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().defaultContent();
	}
}

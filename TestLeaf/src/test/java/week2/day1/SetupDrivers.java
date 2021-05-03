package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static void main(String[] args) {

		// setup the browser
		WebDriverManager.chromedriver().setup();

		// open the browser
		ChromeDriver driver = new ChromeDriver();

		// get url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser
		driver.manage().window().maximize();

		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("DemoSalesManager");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");

		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();

		driver.findElementByLinkText("CRM/SFA").click();

		WebElement leads = driver.findElementByClassName("x-panel-tl");
		leads.click();

		WebElement create = driver.findElementByLinkText("Create Lead");
		create.click();

		WebElement comp = driver.findElementById("createLeadForm_companyName");
		comp.sendKeys("ATS");
		
		WebElement fname  = driver.findElementById("createLeadForm_firstName");
		fname.sendKeys("mani");
		
		WebElement lname  = driver.findElementById("createLeadForm_lastName");
		lname.sendKeys("raja");
		
		WebElement submit1  = driver.findElementByClassName("submitButton");
		submit1.click();

	
	driver.findElementById("mani");
	
	}

}

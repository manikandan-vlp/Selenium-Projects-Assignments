package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 
		 * Delete Lead: 1 Launch the browser 2 Enter the username 3 Enter the password 4
		 * Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8
		 * Click on Phone 9 Enter phone number 10 Click find leads button 11 Capture
		 * lead ID of First Resulting lead 12 Click First Resulting lead 13 Click Delete
		 * 14 Click Find leads 15 Enter captured lead ID 16 Click find leads button 17
		 * Verify message "No records to display" in the Lead List. This message
		 * confirms the successful deletion 18 Close the browser (Do not log out)
		 */

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		try {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			// 1. Launch URL "http://leaftaps.com/opentaps/control/login"

			driver.get("http://leaftaps.com/opentaps/control/login");

			// 2. Enter UserName and Password Using Id Locator

			driver.findElementById("username").sendKeys("DemoSalesManager");

			driver.findElementById("password").sendKeys("crmsfa");

			// 3. Click on Login Button using Class Locator

			driver.findElementByClassName("decorativeSubmit").click();

			// 4. Click on CRM/SFA Link

			driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

			// 6 Click Leads link

			driver.findElementByXPath("(//a[contains(text(),'Leads')])[1]").click();

			// 7 Click Find leads

			driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

			// 8 Click on Phone

			driver.findElementByXPath("//span[contains(text(),'Phone')]").click();

			// 9 Enter phone number

			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9840");

			// 10 Click find leads button

			driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

			// 11 Capture lead ID of First Resulting lead

			Thread.sleep(3000);
			
			WebElement idcap = driver.findElementByXPath("//*[@class='x-grid3-row-table']//td[1]");
			String val = idcap.getText();
			System.out.println(val);
			
			Thread.sleep(2000);
			 idcap.click();
			
			// 12 Click First Resulting lead
			//driver.findElementByXPath(
				//	"//*[@class='x-grid3-row-table']//td[1]").click();

			// 13 Click Delete
			driver.findElementByXPath("//a[contains(text(),'Delete')]").click();

			// 14 Click Find leads
			driver.findElementByXPath("(//a[contains(text(),'Find Leads')])[1]").click();

			// 15 Enter captured lead ID
			driver.findElementByXPath("//a[contains(text(),'Contacts')]").sendKeys(val);

			// 16 Click find leads button

			driver.findElementByXPath("(//a[contains(text(),'Find Leads')])[1]").click();

			// 17 Verify message "No records to display" in the Lead List. This message
			// confirms the successful deletion

			driver.findElementByXPath("//div[contains(text(),'No records to display')]").isDisplayed();

			// 18 Close the browser (Do not log out)

		} catch (Exception e) {

			System.out.println(e);
			
			driver.quit();

		}

	}

}

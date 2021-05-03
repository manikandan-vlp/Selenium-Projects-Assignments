package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		
		
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		

		try {
			
		

		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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
		
		
		/*http://leaftaps.com/opentaps/control/main
		 
		 
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		
		// 6 Click Leads link

		 driver.findElementByXPath("(//a[contains(text(),'Leads')])[1]").click();

		
		 

					driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

					driver.findElementByXPath("//span[contains(text(),'Email')]").click();

					
					//input[@name='emailAddress']
					
					//button[contains(text(),'Find Leads')]
		
		
		
					//table[@class='x-grid3-row-table']
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

}

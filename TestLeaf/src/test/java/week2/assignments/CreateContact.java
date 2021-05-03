package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		// Pseudo Code
		
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

		// 5. Click on contacts Button
		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();

		// 6. Click on Create Contact
		driver.findElementByXPath("// a[contains(text(),'Create Contact')]").click();

		// 7. Enter FirstName Field Using id Locator

		driver.findElementById("firstNameField").sendKeys("Manikandan");

		// input[@id='']

		// 8. Enter LastName Field Using id Locator

		driver.findElementById("lastNameField").sendKeys("Raja");

		// 9. Enter FirstName(Local) Field Using id Locator

		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Rmani");

		// input[@id='']

		// 10. Enter LastName(Local) Field Using id Locator

		driver.findElementById("createContactForm_lastNameLocal").sendKeys("raja");

		// input[@id='']

		// 11. Enter Department Field Using any Locator of Your Choice

		driver.findElementByXPath("//input[@id='createContactForm_departmentName']").sendKeys("STST");

		// 12. Enter Description Field Using any Locator of your choice

		driver.findElementByXPath("// textarea[@name='description']").sendKeys("testing desacriptions");

		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice

		driver.findElementByXPath("// input[@id='createContactForm_primaryEmail']").sendKeys("rmani@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text

		WebElement state = driver.findElementByXPath("//select[@id='createContactForm_generalStateProvinceGeoId']");

		Select select = new Select(state);

		select.selectByVisibleText("New York");

		// 15. Click on Create Contact

		driver.findElementByXPath("	//input[@name='submitButton']").click();

		// 16. Click on edit button

		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();

		// 17. Clear the Description Field using .clear

		driver.findElementByXPath("//textarea[@id='updateContactForm_description']").clear();

		// 18. Fill ImportantNote Field with Any text

		driver.findElementByXPath("//textarea[@id='updateContactForm_importantNote']").sendKeys("testing testing");

		// 19. Click on update button using Xpath locator
		driver.findElementByXPath("	//input[@value='Update']").click();

		// 20. Get the Title of Resulting Page.

		System.out.println(driver.getTitle());

		
		} catch (Exception e) {
			
			System.out.println(e);
			 
			driver.close();
			
			
		}
		
	}

}

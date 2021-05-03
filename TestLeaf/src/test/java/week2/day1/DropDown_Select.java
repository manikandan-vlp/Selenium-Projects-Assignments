package week2.day1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) {

		WebDriver driver = null;

		WebElement element = driver.findElement(By.id("test"));

		Select select = new Select(element);

		List<WebElement> getValue = select.getOptions();
		int size = getValue.size();

		select.selectByIndex(size - 1);

	}

}

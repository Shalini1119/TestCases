package TestScenarios;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SeleniumRepoDropdown {

	 static boolean selectDropDownValue(String locator, String value) {
		try {
			WebElement element = SeliniumRepo.findElement(locator);

			if (element != null) {
				Select selectBox = new Select(element);
				selectBox.selectByValue(value);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
	

	public static boolean selectDropDrownByIndex(String locator, int Index) {
		try {

			if (locator != null) {
			
				WebElement DropdownElement = SeliniumRepo.findElement(locator);
				Select SelectIndex = new Select(DropdownElement);
				SelectIndex.selectByIndex(Index);
			}
			return false;
		} catch (Exception e) {
			System.out
					.println(" Error occured while selecting the option in the select box *"
							+ locator + " ***" + e.getMessage());
			return false;
		}
	}
}
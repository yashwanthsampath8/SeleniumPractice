package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdwons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will wait untill all the components are fully loaded
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);//selecting by index
		dropdown.selectByVisibleText("AED");//selection by using visible text
		dropdown.selectByValue("INR");//selection by value
		String selected = dropdown.getFirstSelectedOption().getText();//this will give you the selected option
		System.out.println(selected);
	}

}

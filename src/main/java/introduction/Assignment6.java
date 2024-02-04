package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.select the checkbox
		 *2.grab the lable of the selected checkbox 
		 *3.select the option from the dropdown which is selected in the checkbox 
		 *4.enter the step2 value which is grabbed from the label text in the textbox
		 *5.click on alert and verify the text message present in the altert box
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String value = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if(text.contains(value)) {
			System.out.print("Contains value");
		}else {
			System.out.print("Do not contain value");
		}
		
	}

}

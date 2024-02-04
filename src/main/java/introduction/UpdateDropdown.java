package introduction;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will wait untill all the components are fully loaded
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*		
		//handling checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//checking assert false
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//prints number of checkboxes in the webpage
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		*/
		
		//for selecting the passenger dropdown
		driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']")).click();
		Thread.sleep(2000);//for waiting 2 sec, to fix synchronization issues
		for(int i = 0; i<3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}	
		System.out.println(driver.findElement(By.id("spanAudlt")).getText());
		//assertions for equal
		Assert.assertEquals(driver.findElement(By.id("spanAudlt")).getText(),"4");
	}

}

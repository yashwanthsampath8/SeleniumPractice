package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will wait untill all the components are fully loaded
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//using parent child xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='MAA']")).click();	
		Thread.sleep(3000);
		//selecting the date which is highlighted
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[4]/a")).click();
		//driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

		//selecting the round trip radio button
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enabled");
		}else
		{
			System.out.println("disabled");
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//checking if the date is enabled
		//boolean en1 = driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		//System.out.print(en1);
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enabled");
		}
		
	}
}

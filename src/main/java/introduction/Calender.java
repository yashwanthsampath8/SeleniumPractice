package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		/*
		//this will wait untill all the components are fully loaded
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day today"));
		int count = driver.findElements(By.className("flatpickr-day today")).size();
		for(int i = 0; i<count;i++) {
			String text = driver.findElements(By.className("flatpickr-day today")).get(i).getText();
			if(text.equalsIgnoreCase("27")) {
				driver.findElements(By.className("flatpickr-day today")).get(i).click();
				break;
			}
		}*/
		driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")){
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("21")){
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}

package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//this will wait untill all the components are fully loaded
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("alertbtn")).click();
		//handling the alert window and getting the text from that window
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		//handling the alert window with OK button
		driver.switchTo().alert().accept();
		//handling ok and cancel alert button
		driver.findElement(By.id("confirmbtn")).click();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().dismiss();		
	}

}

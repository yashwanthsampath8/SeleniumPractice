package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print number of rows and number of columns and 2nd row content
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.cssSelector(".left-align table td:nth-child(2)"));
		List<WebElement> column = driver.findElements(By.cssSelector(".left-align table tr th"));
		System.out.println(rows.size());
		System.out.println(column.size());
		List<WebElement> data = driver.findElements(By.cssSelector(".left-align table tr:nth-child(3) td"));
		for(int i = 0;i<data.size();i++) {
			System.out.println(data.get(i).getText());
		}
	}

}

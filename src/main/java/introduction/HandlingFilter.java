package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("rice");
		List<WebElement> vegies = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filteredlist = vegies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(vegies.size(),filteredlist.size());
	}

}

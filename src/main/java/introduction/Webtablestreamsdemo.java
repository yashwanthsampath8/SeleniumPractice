package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablestreamsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		//capture all webelements into list
		//capture text all webelements into list (original list)
		//sort in the list in step3
		//compare origninal vs sorted list
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		/*
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originallist = items.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originallist.equals(sortedlist));
		*/
		List<String> price;
		//getting the price of the rice
		//scan the name column with getText -> Beans - asked to print the price of the rice
		do {
			List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
			price = items.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
	}

}

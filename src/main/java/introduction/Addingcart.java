package introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//adding implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(3000);
		//taking vegetable names in string array
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[1]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		//getting the product names and storing in the list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		//iterating through the elements
		for(int i = 0; i<products.size();i++) {
			//converting array of elements to list
			List itemsNeededList = Arrays.asList(itemsNeeded);	
			//splitting the value with hiphen(-) 
			String[] name = products.get(i).getText().split("-");
			//removing the white spaces
			String name1 = name[0].trim();
			int j = 0;
			//comparing the item if that contains in the list and clicking on that items add to cart button
			if(itemsNeededList.contains(name1)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
	}
}

package introduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.get("https://courses.rahulshettyacademy.com/courses/");
		//getting the title from the new window 
		String title = driver.findElements(By.cssSelector("div.course-listing-title")).get(1).getText();
		driver.switchTo().window(parent);
		//adding that same title in the previous window textbox
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(title);
		//taking the element screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		//driver.quit();
		
		//get hight and width 
		System.out.print(name.getRect().getDimension().getHeight());
		System.out.print(name.getRect().getDimension().getWidth());
	}

}

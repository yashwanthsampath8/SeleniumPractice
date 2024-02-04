package introduction;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		//new tab or new window is treated as window only
		Set<String> windows = driver.getWindowHandles(); //parent id and child id
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//switch to child window
		driver.switchTo().window(childId);
		//gets the text from that page and prints
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//grabbing the email id from the text
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		//switch back to parent window
		driver.switchTo().window(parentId);
		//sending mail id to user name
		driver.findElement(By.id("username")).sendKeys(email);
	}

}

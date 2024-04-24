package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//from main page to Frame1
		driver.switchTo().frame("frame1");
		WebElement inpBox=driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hey Hi");
		
		//from Frame1 to Frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//from Frame3 to Frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Adarsh");
		
		//From Frame to Main page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		
	}

}


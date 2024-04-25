package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		//driver.findElement(By.xpath("//span[@class='ctp-label']")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String strTitle= (String)js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement searchBox= (WebElement) js.executeScript("return document.getElementByName('search')[0]");
		searchBox.sendKeys("Phone");
		driver.findElement(By.cssSelector("button.btn.btn-light.btn-lg")).click();
		
		js.executeScript("history.go(-1)");
		js.executeScript("window.scrollBy(10,700)");
		js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	}

}

package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.get("https://uitestingplayground.com");
		
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		
		driver.findElement(By.linkText("Load Delay")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		
	}

}

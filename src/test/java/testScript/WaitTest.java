package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uitestingplayground.com/ajax");
		
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.id("ajaxButton")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
		
		String strTxt= driver.findElement(By.cssSelector("div#content")).getText();
		System.out.println(strTxt);
	}

}

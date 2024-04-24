package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//Accept Alert
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println("Alert Text: "+alert.getText());
		alert.accept();
		
		//Dismiss Alert
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		Alert confirm= driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println("Alert text: "+confirm.getText());
		confirm.dismiss();
		
		//Handling Prompt
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert prompt= driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert text: "+prompt.getText());
		prompt.sendKeys("Hello Adarsh");
		Thread.sleep(3000);
		prompt.accept();
		

	}

}

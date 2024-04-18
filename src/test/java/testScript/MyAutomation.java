package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyAutomation {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.setBrowserVersion("115");       //run test on chrome version-115
		
		WebDriver driver=new ChromeDriver(options);
		
		// WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page Title.."+ driver.getTitle());

	}

}

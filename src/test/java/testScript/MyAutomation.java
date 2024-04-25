package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyAutomation {

	public static void main(String[] args) {
		
		//ChromeOptions options= new ChromeOptions();
		//options.setBrowserVersion("115");       //run test on chrome version-115
		//options.addArguments("--headless");
		//WebDriver driver=new ChromeDriver(options);
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		System.out.println("Page Title.."+ driver.getTitle());
		
		//WebElement src_box= driver.findElement(By.id("APjFqb"));
		WebElement src_box= driver.findElement(By.name("q"));
		//WebElement src_box= driver.findElement(By.className("gLFyf"));
		//WebElement src_box= driver.findElement(By.tagName("textarea"));
		src_box.sendKeys("Java Tutorial");
		//src_box.sendKeys(Keys.ENTER);
		
		List<WebElement> listItems= driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='YacQv'])"));
		System.out.println("total items: "+listItems.size());
		
		//System.out.println("Page Title.."+ driver.getTitle());
		//System.out.println("new Url: "+ driver.getCurrentUrl());
		
		//driver.navigate().back();
		
		//System.out.println("page title after back"+ driver.getTitle());
		
		//driver.navigate().forward();
		//driver.navigate().refresh();
	}

}

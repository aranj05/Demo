package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> lists=driver.findElements(By.xpath("//td[text()='San Francisco']//preceding-sibling::td[2]"));
		
		System.out.println("Number of items..."+lists.size());
		for(WebElement name: lists) {
			System.out.println(name.getText());
		}

	}

}

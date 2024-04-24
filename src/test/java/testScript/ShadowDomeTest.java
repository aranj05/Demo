package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomeTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		
		//shadow Dom
		SearchContext context= driver.findElement(By.xpath("//my-paragraph)[1]"));
		WebElement txt= context.findElement(By.cssSelector("slot[name='my-text']"));
		System.out.println(txt.getText());
		
		//Normal Dom
		WebElement strTxt= driver.findElement(By.xpath("//span[contains(text(),'different')]"));
		System.out.println(strTxt.getText());

	}

}

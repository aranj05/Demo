package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutocompleteTest {
	

	public static void main(String[] args)throws InterruptedException {
		

		String expValue= "JavaScript";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions actions= new Actions(driver);
		driver.get("https://jqueryui.com/autocomplete/");
		
	WebElement frame1= driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frame1);
	WebElement inp= driver.findElement(By.cssSelector("#tags"));
	
	inp.sendKeys("as");
	Thread.sleep(2000);
	List<WebElement> items= driver.findElements(By.cssSelector("ul#ui-id-1 >li"));
	
	//To know the no of matching items
	System.out.println("Number of matching items: "+items.size());
	
	//To get the text of each item
	for(WebElement item: items) {
		
		//To get the text of each item
		System.out.println(item.getText());
		
		//To select the expected value
		if(item.getText().equalsIgnoreCase(expValue)) {
			item.click();
			break;
		}
	}
	}

}

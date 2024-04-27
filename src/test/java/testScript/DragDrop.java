package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from=driver.findElement(By.xpath("//div//span[contains(text(),'Draggable 3')]"));
		WebElement to= driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		actions.dragAndDrop(from, to).perform();
		
		//driver.findElement(By.xpath("//div[@id='droppedlist']//span[contains(text(),'Draggable 3')]")).isDisplayed();

	}

}

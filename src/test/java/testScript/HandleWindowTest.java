package testScript;

import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		//window handle
		String perentWin= driver.getWindowHandle();
		System.out.println("Parent Win: "+perentWin);
		
		WebElement tabBtn= driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
		tabBtn.click();
		System.out.println("Page Title: "+driver.getTitle());
		
		//Switch to child window
		Set<String> tabs= driver.getWindowHandles();
		System.out.println("Number od window: "+tabs.size());
		for(String child:tabs) {
			System.out.println("Windows: "+child);
			if(!child.equalsIgnoreCase(perentWin)) {
				driver.switchTo().window(child);
				System.out.println("child win Title:"+driver.getTitle());
			}
		}
		//back to parent window & do operation
		driver.close();
		driver.switchTo().window(perentWin);
		System.out.println("Parent win Title:"+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
		Set<String> wins= driver.getWindowHandles();
		System.out.println("Number od window: "+wins.size());
		for(String win:wins) {
			System.out.println("Windows: "+win);
			if(!win.equalsIgnoreCase(perentWin)) {
				driver.switchTo().window(win);
				System.out.println("win Title:"+driver.getTitle());
			}
		}
		//launch new url from parent window
		driver.close();
		driver.switchTo().window(perentWin);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		driver.quit();
		
		

	}

}

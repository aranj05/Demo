package testScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MouseAction {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions= new Actions(driver);
		driver.get("https://demo.opencart.com");
		
		WebElement menu= driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-child(3)"));
		actions.moveToElement(menu).perform();
		
		//WebElement manuitem= driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors(2)']"));
		//actions.moveToElement(menu).click(manuitem).build().perform();
		
		//screenshot
		TakesScreenshot screen= (TakesScreenshot)driver;
		File srcImg= screen.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+ "/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(srcImg, new File(path));
	}

}

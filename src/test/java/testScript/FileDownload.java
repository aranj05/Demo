package testScript;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		
		Map<String,Object> prefs= new HashMap<String,Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		Thread.sleep(2000);
		
		WebElement btnDownload=driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']"));
		btnDownload.click();
		Thread.sleep(7000);
		

	}

}

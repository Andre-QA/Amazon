package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	protected static WebDriver driver;
	
	public void abrirNavegador(String Site) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome atual\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Site);
		driver.manage().window().maximize();
		
		
		
		
	}

}

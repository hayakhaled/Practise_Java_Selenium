import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Options {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\QA_Atomation\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		List<WebElement> myOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0 ; i<myOptions.size(); i++) {
			
			System.out.println(myOptions.get(i).getText());
		
			
		}

	}

}

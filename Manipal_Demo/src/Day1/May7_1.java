package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class May7_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		WebElement link = driver.findElement(By.linkText("Employee List"));
		
		
		Actions act=new Actions(driver);
		Action build = act.moveToElement(link).build();
		build.perform();
		act.sendKeys(link, Keys.ENTER).perform();
		
		act.sendKeys(Keys.TAB,Keys.ENTER).perform();  // to open the new tab in the browser.
		
		

	}

}

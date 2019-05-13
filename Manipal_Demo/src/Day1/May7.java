package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class May7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		//driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement carlink = driver.findElement(By.linkText("Car Rentals"));
		//WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Car Rentals')]"));  

		Actions act=new Actions(driver);
		Action build = act.moveToElement(carlink).build();
		build.perform();
		act.sendKeys(carlink,(Keys.ENTER)).perform();

	}

}

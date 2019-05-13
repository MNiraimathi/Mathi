package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class May7_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://realestate.upskills.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("sign-in")).click();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		// one way to achieve - with errors are there
		driver.findElement(By.xpath("//*[contains(@href,'http://realestate.upskills.in/wp-admin/profile.php')]")).click();
		driver.findElement(By.linkText("Edit My Profile")).click();
		
		 // second way to achieve the same with actions class
		 WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		 Actions builder = new Actions(driver);
		builder.moveToElement(link).click().build().perform();
		

	}

}

package Day1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class May8_gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		ArrayList<String> arr1= new ArrayList<>(driver.getWindowHandles());
		System.out.println("The number of windows " + arr1.size());
		driver.switchTo().window(arr1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'Sign')])[2]")).click();
		//driver.findElement(By.xpath("//a[@title='Create an account']")).click();
		//driver.switchTo().window(arr1.get(0));

	}

}

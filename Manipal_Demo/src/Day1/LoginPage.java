package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String Expectedtitle = "OrangeHRM";
		String ActualTitle = driver.getTitle();
		if(Expectedtitle.equals(ActualTitle)) {
			System.out.println("The title is the same");
			driver.findElement(By.id("welcome")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//driver.close();
		}
		else {
			System.out.println("The title is not same");
			driver.close();
		}
	}

}

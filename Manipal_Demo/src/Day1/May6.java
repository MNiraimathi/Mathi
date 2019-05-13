package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May6 {

	private static String text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		String username= driver.findElement(By.name("txtUsername")).getAttribute("value");
		System.out.println(username);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Performance")).click();
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		System.out.println(links1.size());
		for ( WebElement w : links1)
		{
			text = w.getText();
			//string text1 = w.getText();
			System.out.println(text);
		}
		
	}

}

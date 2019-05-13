package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		// to get the text from webpage 
		String username= driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(username);
		// to get the text from webpage 
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@name='tripType' and @value = 'oneway']")).click();
		WebElement SS = driver.findElement(By.name("passCount"));
		Select sel = new Select(SS);
		List<WebElement> ll = sel.getOptions();
		System.out.println(ll.size());
		sel.selectByIndex(1);
		WebElement SS1 = driver.findElement(By.name("fromPort"));
		Select sel1 = new Select(SS1);
		//List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		List<WebElement> ll1 = sel1.getOptions();
		for(int i=0; i<ll1.size();i++)
		{
		System.out.println(ll1.get(i).getText());
		}
		sel1.selectByValue("Portland");
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		// passengers details
		driver.findElement(By.name("passFirst0")).sendKeys("Muhil Sai");
		driver.findElement(By.name("passLast0")).sendKeys("S.N");
		driver.findElement(By.name("passFirst1")).sendKeys("Suresh Kumar");
		driver.findElement(By.name("passLast1")).sendKeys("J");
		driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 9012 3456");
		//driver.findElement(By.xpath("//*[@name = 'ticketLess' and @value ='checkbox']")).click();
		
		// multiple check box with same attribute value so using the below code
		List<WebElement> checkboxes = driver.findElements(By.name("ticketLess"));
		for ( WebElement w : checkboxes)
		{
			w.click();
		}
		driver.findElement(By.name("buyFlights")).click();
		//need to fix this code
		//driver.findElement(By.linkText("mercurysignoff.php")).click();
		

	}

}

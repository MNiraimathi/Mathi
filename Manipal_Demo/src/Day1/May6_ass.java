package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May6_ass {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manipal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Home")).click();
		//String exptit = 
		String tit = driver.getTitle();
		//System.out.println(tit);
		if (tit == "UNDER CONSTRUCTION:Mercury Tours")
		{
			System.out.println("Home Page is under construction");
		}
		else
		{
			System.out.println("Home Page is  working");
		}
	
		//
		driver.findElement(By.linkText("Flights")).click();
		String tit1 = driver.getTitle();
	System.out.println("title1 is " + tit1);
	if (tit1 == "UNDER CONSTRUCTION:Mercury Tours")
	{
		System.out.println("Flights Page is under construction");
	}
	else
	{
		System.out.println( "Flights Page is  working");
	}
		//
	
	driver.findElement(By.linkText("Hotels")).click();
		String tit2 = driver.getTitle();
	System.out.println("title1 is " + tit2);
	if (tit2 == "UNDER CONSTRUCTION:Mercury Tours")
	{
		System.out.println("Hotels Page is under construction");
	}
	else
	{
		System.out.println( "Hotels Page is  working");
	}
	}
/*
 *int i=0;
        //Extract the link texts of each link elements
        for(WebElement e:linkElements)
        {
            linkText[i]= e.getText();
            i++;
        }
        
        //test each link
        for(String t:linkText)
        {
            driver.findElement(By.linkText(t)).click();
            if(driver.getTitle().equals(underconsTitle))
            {
                System.out.println("\"" +t+ "\"" + "\" + is Under Construction");
            }
            else
            {
                System.out.println("\"" +t+ "\"" + "\" + is Working");
            }
        
            driver.navigate().back();
        }
        driver.quit();
 */
	}



package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linksjava {
	public static void main(String[] args) throws InterruptedException {
		// Setting the Chrome Driver
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
        driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
        
        String where = (driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"))).getAttribute("href");
        System.out.println("Where I'm going : " +where); 
        
        String brkurl = (driver.findElement(By.xpath("//a[text()='Verify am I broken?']"))).getAttribute("href");
        if(brkurl.contains("error")) {	
        	System.out.println("Broken");
        }else {
        	System.out.println("not broken");
        }
        
        //Interact with same link name
        driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
        
        driver.close();
	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		// Setting the Chrome Driver
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		//Getting position of the button
		driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println("Location");
		//If we give getLocation(x or y); --> It returns particular x or y value
		//Getting color of the button
		driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Color");//This will give color value
		//Find the height and width
		driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
	    System.out.println("Size");
	    //if we give getSize().getHeight() --> returns only height
	    //if we give getSize().getWidth()--> returns only width
	    
	    
	}

}

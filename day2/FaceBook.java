package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	public static void main(String[] args) {
		// Setup the driver
		WebDriverManager.chromedriver().setup();

		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://en-gb.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click Create Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sekar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vignesh1995@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("vickee11");
		driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select")).sendKeys("04");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Oct");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");
		driver.findElement(By.xpath("//label[contains(@text(),Male)]/following::label")).click();
	}
}

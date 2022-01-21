package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		// Setting the Chrome Driver
					WebDriverManager.chromedriver().setup();
					// Launch the browser
					ChromeDriver driver = new ChromeDriver();

					// Load the url
					driver.get("http://leafground.com/pages/checkbox.html");
					//Select the languages you know
					driver.findElement(By.xpath("//div[1]/input")).click();
					driver.findElement(By.xpath("//div[4]/input")).click();
					//Confirm Selenium is Checked
					System.out.println("Is the check box checked : ");
					driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
					//Uncheck the checked value
					Boolean select = driver.findElement(By.xpath("//div[text()='Not Selected']/input")).isSelected();
					Boolean deselect = driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected();
					if(select == true) {
						driver.findElement(By.xpath("//div[text()='Not Selected']/input")).click();
					}else if(deselect == true) {
						driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
					}
					//Select all the options
					driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
					driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
					driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
					driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
					driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
	}
}

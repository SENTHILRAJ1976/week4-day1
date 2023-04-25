package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealProject {

	public static void main(String[] args) {
	
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[text()='Men's Fashion']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions builder = new Actions(driver);
		WebElement sportShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		builder.moveToElement(sportShoes).perform();
		
		
		
		
		
		
		
	}

}

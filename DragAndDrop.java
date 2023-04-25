package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.xpath("//p[contains(text(), 'Drag me to my target')]"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(dd, 170, 45).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}

package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERail {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement ele = driver.findElement(By.id("txtStationFrom"));
		ele.sendKeys("Mgr Chennai Ctr");
		ele.sendKeys(Keys.DOWN);
		ele.sendKeys(Keys.ENTER);		
				
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement ele1 = driver.findElement(By.id("txtStationTo"));
		ele1.sendKeys("Coimbatore Jn");
		ele1.sendKeys(Keys.DOWN);
		ele1.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		
		System.out.println("Printing Train details");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		
		List<WebElement> tbl = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[2]/td[2]"));
		int col = tbl.size();
		System.out.println(col);		

		/*
		 * List<WebElement> tbl1 = driver.findElements(By.xpath(
		 * "//div[@id='divTrainsList']/table[1]/tbody/tr[2]/td")); int row =
		 * tbl1.size(); System.out.println(row);
		 */		
		List<String> getCount = new ArrayList<String>();
		
		
		for(WebElement ele3: tbl) {
			getCount.add(ele3.getText());
		}
		
		Collections.sort(getCount);
		
		System.out.println(getCount);
	
		/*
		 * for(int i = 2; i<=col; i++) { String text =
		 * driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+i
		 * +"]/td[2]")).getText(); System.out.println(text); }
		 */		
		
		driver.close();

	}

}

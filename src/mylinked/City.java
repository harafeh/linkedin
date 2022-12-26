package mylinked;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class City {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://booking.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String city="Amman";
		Keys theKeys=Keys.ARROW_DOWN;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(1000);
driver.findElement(By.id("ss")).click();
driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(city);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(theKeys);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(Keys.ENTER);

	}

}

package mylinked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Project {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		String email="arbsh2arbsh@yahoo.com";
		String passTest="Pass12345A12!";
		
		System.setProperty("webdriver.chrome.driver", "D:\\myproject\\chromedriver.exe");
		
		
WebDriver driver=new ChromeDriver();

driver.get("https://Booking.com");
driver.findElement(By.xpath("//header[@class='bui-header bui-header--logo-large bui-u-hidden-print bui-header--rounded-tabs ']//div[5]//a[1]")).click();

driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);
driver.findElement(By.id("new_password")).sendKeys(passTest);
driver.findElement(By.id("confirmed_password")).sendKeys(passTest);
driver.findElement(By.xpath("//button[@type='submit']")).click();





	}

}

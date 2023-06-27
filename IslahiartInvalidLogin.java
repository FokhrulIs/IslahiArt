package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IslahiartInvalidLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("xoo-el-username")).sendKeys("fisobuj@gmail.com");
		driver.findElement(By.name("xoo-el-password")).sendKeys("America1234567");
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	    
       

	}

}

package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartuserChangePasswUpdate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("xoo-el-username")).sendKeys("fisobuj@gmail.com");
		driver.findElement(By.name("xoo-el-password")).sendKeys("America1234567$");
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div[1]/div/ul/li[2]/a/span[2]")).click();
	    driver.findElement(By.id("account_first_name")).clear();
	    driver.findElement(By.name("account_first_name")).sendKeys("FI");
	    driver.findElement(By.id("account_last_name")).clear();
	    driver.findElement(By.name("account_last_name")).sendKeys("Sobuj");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.name("save_account_details")).click();
	}

}

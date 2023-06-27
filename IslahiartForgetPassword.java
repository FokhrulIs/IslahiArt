package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartForgetPassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[3]/a")).click();
		driver.findElement(By.name("user_login")).sendKeys("fisobuj@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[4]/div/form/button")).click();

	}

}

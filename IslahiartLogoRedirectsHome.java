package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartLogoRedirectsHome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[2]/div/div/div/div[1]/div[1]/div/span/a/img")).click();

	}

}

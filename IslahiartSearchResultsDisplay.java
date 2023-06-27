package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartSearchResultsDisplay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[2]/aside")).click();
		
		WebElement ele= driver.findElement(By.id("dgwt-wcas-search-input-1"));
		ele.sendKeys("T-Shirts");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);

	}

}

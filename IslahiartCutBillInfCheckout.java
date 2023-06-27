package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IslahiartCutBillInfCheckout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("xoo-el-username")).sendKeys("fisobuj@gmail.com");
		driver.findElement(By.name("xoo-el-password")).sendKeys("America1234567$");
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
       
	    Thread.sleep(3000);
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a"));
        act.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("//*[@id=\"menu-item-2071\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[6]/div[2]/a/h2")).click();
        driver.findElement(By.xpath("//*[@id=\"ast-sticky-row-summary\"]/div[2]/form/table/tbody/tr[1]/td/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"plus_qty\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ast-sticky-row-summary\"]/div[2]/form/div/div[2]/button")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"ast-bag-icon-svg\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"astra-mobile-cart-drawer\"]/div[2]/div/div/p[2]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("billing_address_1")).sendKeys("2807 Golfview St");
		driver.findElement(By.id("billing_city")).sendKeys("Lakeland");
		driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span")).click();
		WebElement ele1= driver.findElement(By.xpath("/html/body/span[2]/span/span[1]/input"));
		ele1.sendKeys("Flo"); 
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("billing_postcode")).sendKeys("33801");
		driver.findElement(By.id("billing_phone")).sendKeys("3472491593");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("5312 6001 1631 7602");
		driver.findElement(By.name("exp-date")).sendKeys("06/27");
		driver.findElement(By.name("cvc")).sendKeys("329");
	     
		
      
	}

}

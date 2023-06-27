package IslahiartDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartIvalidInputDuringReg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("xoo_el_reg_email")).sendKeys("fisobuj@gmail.com");
		driver.findElement(By.name("xoo_el_reg_fname")).sendKeys("Fokhrul");
		driver.findElement(By.name("xoo_el_reg_lname")).sendKeys("Islam");
		driver.findElement(By.name("xoo_el_reg_pass")).sendKeys("America1234567$");
		driver.findElement(By.name("xoo_el_reg_pass_again")).sendKeys("America1234567");
		Thread.sleep(2000);
		driver.findElement(By.name("xoo_el_reg_terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"button btn xoo-el-action-btn xoo-el-register-btn\"]")).click();



	}

}

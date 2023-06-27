package IslahiartDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IslahiartIncorrectMassPrintScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://islahiart.com/my-account/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("xoo-el-username")).sendKeys("fisobuj@gmail.com");
		driver.findElement(By.name("xoo-el-password")).sendKeys("America1234567");
		
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	   Thread.sleep(2000);
       WebElement ele= driver.findElement(By.xpath("//div[@class=\"xoo-el-notice-error \"]"));
       String st= ele.getText();
       if(st.contains("Incorrect Email or Username. Lost your password?")) {
    	   TakesScreenshot screenshot= ((TakesScreenshot)driver);
    	   File file= screenshot.getScreenshotAs(OutputType.FILE);
    	   File dest= new File("C:\\Users\\fokhr\\Desktop\\New folder\\Islahiart.jpg");
    	   FileUtils.copyFile(file, dest);
       }

	}

}

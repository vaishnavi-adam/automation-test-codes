package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\Vaishnavi\\Automation Testing\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/r.php?entry_point=login");
		
		dr.findElement(By.name("firstname")).sendKeys("Vaishnavi");
		dr.findElement(By.name("lastname")).sendKeys("Adam");
		
		Select date=new Select(dr.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("14");
		Select month=new Select(dr.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("May");
		Select year=new Select(dr.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("2020"); 
		
		dr.findElement(By.xpath("//label[normalize-space()='Female']//input[@id='sex']")).click();
		
		dr.findElement(By.name("reg_email__")).sendKeys("8856812523");
		
		dr.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ABC@123456");
		
		

	}

}

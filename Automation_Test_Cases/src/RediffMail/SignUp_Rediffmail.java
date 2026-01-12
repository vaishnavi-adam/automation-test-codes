package RediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Rediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\Vaishnavi\\Automation Testing\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Vaishnavi Adam");
	
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("Vaish14");
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[6]/div[1]/input[1]")).sendKeys("va@1414");
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]")).sendKeys("va@1414");
		
		Select date=new Select(dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[1]")));
		date.selectByVisibleText("14");
		Select month=new Select(dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[2]")));
		month.selectByVisibleText("MAY");
		Select year=new Select(dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[3]")));
		year.selectByVisibleText("2000");
		
		dr.findElement(By.xpath("//input[@value='f']")).click();
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[11]/div[1]/select[1]")).sendKeys("Pune");
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[14]/div[1]/div[1]/input[1]")).sendKeys("vaish1405@gmail.com");
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[17]/div[1]/div[1]/input[1]")).sendKeys("1234567890");
		
		dr.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[20]/input[1]")).click();

	}

}

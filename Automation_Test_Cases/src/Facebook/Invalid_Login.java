package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\Vaishnavi\\Automation Testing\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

        String[][] loginData = {
                {"wrong@email.com", "correctPassword"},
                {"correct@email.com", "wrongpassword"},
                {"wrong@email.com", "wrongpassword"}
        };

        for (int i = 0; i < loginData.length; i++) {

            driver.get("https://www.facebook.com");

            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(loginData[i][0]);

            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys(loginData[i][1]);

            driver.findElement(By.name("login")).click();

            Thread.sleep(2000);

            String errorText = driver.findElement(By.xpath("//div[contains(text(),'incorrect')]")).getText();
            System.out.println("Error Message: " + errorText);
        }

        driver.quit();
    }


	}



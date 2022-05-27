package in.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mini_project {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jagadeesh\\eclipse-workspace\\My_Maven_Project\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php/");
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email_create")).sendKeys("kjaagan@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Jagan");
		Thread.sleep(5000);
		driver.findElement(By.id("customer_lastname")).sendKeys("K");
		Thread.sleep(5000);
		driver.findElement(By.id("passwd")).sendKeys("jagan123");
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("days"));
		Select d = new Select(day);
		d.selectByValue("24");
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.id("months"));
		Select m = new Select(month);
		m.selectByValue("7");
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.id("years"));
		Select y = new Select(year);
		y.selectByValue("1996");
		Thread.sleep(5000);
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Accenture");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("Chennai");
		Thread.sleep(5000);
		WebElement state = driver.findElement(By.id("id_state"));
		Select s = new Select(state);
		s.selectByIndex(19);
		Thread.sleep(5000);
		driver.findElement(By.id("postcode")).sendKeys("12456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Shopping");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[7]")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("14852");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[9]")).sendKeys("chennai");
		Thread.sleep(5000);
		driver.findElement(By.id("submitAccount")).click();

		}

}

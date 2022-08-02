package com.automation.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		sign_in.click();
		WebElement email_txt = driver.findElement(By.xpath("//input[@id='email_create']"));
		email_txt.sendKeys("anurag@6875.com");
		WebElement submit_button = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		submit_button.click();
		WebElement malebutton = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		malebutton.click();
		WebElement first_name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		first_name.sendKeys("Anurag");
		WebElement last_name = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		last_name.sendKeys(".j");
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("Anurag@12457");
		WebElement date = driver.findElement(By.xpath("(//option[@value='18'])[1]"));
		date.click();
		WebElement month = driver.findElement(By.xpath("(//option[@value='11'])[2]"));
		month.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='1999']"));
		year.click();
		WebElement newsletter_checkbox = driver.findElement(By.xpath("//input[@id='newsletter']"));
		newsletter_checkbox.click();
		WebElement special_offer_checkbox = driver.findElement(By.xpath("//input[@id='optin']"));
		special_offer_checkbox.click();
		//WebElement first_name1 = driver.findElement(By.xpath("//input[@name='firstname']"));
		//first_name1.sendKeys("Anurag");
		//WebElement last_name1 = driver.findElement(By.xpath("//input[@name='lastname']"));
		//last_name1.sendKeys(".j");
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("nil");
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("No:12, jayaram nagar");
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address2']"));
		address1.sendKeys("3rd cross street");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.xpath("//option[text()='Indiana']"));
		state.click();
		WebElement postal_code = driver.findElement(By.xpath("//input[@id='postcode']"));
		postal_code.sendKeys("46011");
		WebElement country = driver.findElement(By.xpath("(//option[@value='21'])[3]"));
		country.click();
		WebElement mobile_number = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobile_number.sendKeys("954647499");
		WebElement future_ref = driver.findElement(By.xpath("//input[@name='alias']"));
		future_ref.sendKeys("chennai,tamilnadu");
		WebElement register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		register.click();
		
		
		
		
		
		
		
		
		
		

	}

}

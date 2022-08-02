package com.automation.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_runner_project {
	public static WebDriver driver;

	public static void login() throws InterruptedException {
		WebElement sign_in_btn = driver.findElement(By.xpath("//a[@class='login']"));
		sign_in_btn.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("anurag@6875.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Anurag@12457");
		Thread.sleep(2000);
		WebElement submit_btn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		submit_btn.click();
	}

	public static void select_Dresses() {
		Actions a = new Actions(driver);
		WebElement dresses = driver.findElement(
				By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[.='Dresses']"));
		a.moveToElement(dresses).build().perform();
		WebElement casual_dresses = driver.findElement(
				By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[.='Casual Dresses']"));
		a.moveToElement(casual_dresses).build().perform();
		a.click(casual_dresses).build().perform();
		WebElement image_Click = driver.findElement(By.xpath("//a[@class='product_img_link']"));
		image_Click.click();
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frames);
		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		quantity.click();
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s = new Select(size);
		s.selectByIndex(1);
		WebElement colour = driver.findElement(By.xpath("//a[@title='Orange']"));
		colour.click();
		WebElement add_To_Cart = driver.findElement(By.xpath("//p[@id='add_to_cart']/button/span"));
		add_To_Cart.click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void checkout_process() {
		WebElement proceed_to_checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed_to_checkout.click();

		WebElement proceed_to_checkout_confi = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		proceed_to_checkout_confi.click();

		WebElement proceed_to_checkout_Adress = driver.findElement(By.xpath("//button[@name='processAddress']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		proceed_to_checkout_Adress.click();

		WebElement agree_Term_con = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agree_Term_con.click();
		WebElement proceed_to_checkout_shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		proceed_to_checkout_shipping.click();

		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		WebElement conform_Order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		conform_Order.click();
		
		WebElement back_to_Order = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		back_to_Order.click();

		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Automation project practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		login();
		select_Dresses();
		checkout_process();
		

	}

}

package com.adactin.runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_hotel_book {
	public static WebDriver driver;
	public static  void login_process() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("anurag1811");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("anurag1999");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();

	}
	public static void search_Hotel_Sun_Shine () throws InterruptedException {
		WebElement Location = driver.findElement(By.xpath("//option[@value='London']"));
		Location.click();
		WebElement Hotels = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
		Hotels.click();
		WebElement Room_Type = driver.findElement(By.xpath("//option[@value='Double']"));
		Room_Type.click();
		WebElement Number_of_Rooms = driver.findElement(By.xpath("(//option[@value='2'])[1]"));
		Number_of_Rooms.click();
		WebElement Check_In_Date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Check_In_Date.click();
		WebElement Check_out_Date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Check_out_Date.click();
		WebElement Adults_per_Room = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
		Adults_per_Room.click();
		WebElement Children_per_Room = driver.findElement(By.xpath("//option[@value='0']"));
		Children_per_Room.click();
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
	}
	public static void payment_details() throws InterruptedException {
		WebElement Select_Hotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		Select_Hotel.click();
		WebElement click_continue = driver.findElement(By.xpath("//input[@type='submit']"));
		click_continue.click();
		// book a hotel
		WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		first_name.sendKeys("Anurag");
		WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
		last_name.sendKeys(".j");
		WebElement billing_address = driver.findElement(By.xpath("//textarea[@name='address']"));
		billing_address.sendKeys("no:12 , porur ,chennai");
		Thread.sleep(2000);
		WebElement credit_card_number = driver.findElement(By.xpath("//input[@name='cc_num']"));
		credit_card_number.sendKeys("5001010110826662");
		WebElement credit_card_type = driver.findElement(By.xpath("//option[@value='VISA']"));
		credit_card_type.click();
		// Expiry date
		// month
		WebElement month = driver.findElement(By.xpath("//option[@value='11']"));
		month.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='2022']"));
		year.click();
		Thread.sleep(2000);
		// ccv
		WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		ccv.sendKeys("108");
		Thread.sleep(2000);
		// book now
		WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
		book_now.click();
		Thread.sleep(2000);
		//WebElement search_hotel = driver.findElement(By.xpath("//a[.='Search Hotel']"));
		//search_hotel.click();
		
		}
	public static  void Hotel_creek() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']//following::option[.='Brisbane']"));
        location.click();
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']//following::option[.='Hotel Creek']"));
		Hotels.click();
		WebElement Room_Type = driver.findElement(By.xpath("//option[@value='Double']"));
		Room_Type.click();
		WebElement Number_of_Rooms = driver.findElement(By.xpath("(//option[@value='2'])[1]"));
		Number_of_Rooms.click();
		WebElement Check_In_Date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Check_In_Date.click();
		WebElement Check_out_Date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Check_out_Date.click();
		WebElement Adults_per_Room = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
		Adults_per_Room.click();
		WebElement Children_per_Room = driver.findElement(By.xpath("//option[@value='0']"));
		Children_per_Room.click();
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
	}

	public static void Hotel_hervey() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']//following::option[.='Brisbane']"));
        location.click();
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']//following::option[.='Hotel Hervey']"));
		Hotels.click();
		WebElement Room_Type = driver.findElement(By.xpath("//option[@value='Double']"));
		Room_Type.click();
		WebElement Number_of_Rooms = driver.findElement(By.xpath("(//option[@value='2'])[1]"));
		Number_of_Rooms.click();
		WebElement Check_In_Date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Check_In_Date.click();
		WebElement Check_out_Date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		Check_out_Date.click();
		WebElement Adults_per_Room = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
		Adults_per_Room.click();
		WebElement Children_per_Room = driver.findElement(By.xpath("//option[@value='0']"));
		Children_per_Room.click();
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
	}		  
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Manojkrishnan\\eclipse-workspace\\Automation project practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		login_process();
		Thread.sleep(2000);
		
		search_Hotel_Sun_Shine();
		payment_details();
		WebElement search_hotel = driver.findElement(By.xpath("//a[.='Search Hotel']"));
		search_hotel.click();
		
		Hotel_creek();
		payment_details();
		WebElement search_hotel2 = driver.findElement(By.xpath("//a[.='Search Hotel']"));
	    search_hotel2.click();
		
		Hotel_hervey();
		payment_details();
			
	}

}

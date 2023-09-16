package Flyaway.Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flyaway extends ExtentReport{
	Pageobjectforflyaway pom=new Pageobjectforflyaway();
	@BeforeTest
	public void Before() {
		System.out.println("Flyaway Test is Started");
	}
	@Test
	public void Login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8083/FlyAway/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(20,SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		String url=driver.getCurrentUrl();
		System.out.println("URl:"+url);
		Configreport();
		CreateTest();
		driver.findElement(By.xpath(pom.LoginButton())).click();
		driver.findElement(By.xpath(pom.EnterUserID())).sendKeys("bindu.palakaluri@gmail.com");
		driver.findElement(By.xpath(pom.EnterPassword())).sendKeys("Psrvyb@22");
		driver.findElement(By.xpath(pom.Clickloginbutton())).click();
		System.out.println("Login Sucess");
		driver.findElement(By.xpath(pom.ClickHomePage())).click();
		System.out.println("Navigated to Home Page");
		WebElement dropdown=driver.findElement(By.xpath(pom.FromDropdown()));
		Select FromDropDown= new Select(dropdown);
		FromDropDown.selectByVisibleText("Bangalore");
		WebElement dropdown1=driver.findElement(By.xpath(pom.ToDropdown()));
		Select ToDropDown= new Select(dropdown1);
		ToDropDown.selectByVisibleText("Chennai");
		driver.findElement(By.xpath(pom.SubmitDropDown())).click();
		driver.findElement(By.xpath(pom.BookFlight())).click();
		driver.findElement(By.xpath(pom.CompleteBooking())).click();
		
		String Confirmation=driver.findElement(By.xpath(pom.BookingConfirmation())).getText();
		System.out.println("Booking Description: "+Confirmation);
		driver.findElement(By.xpath(pom.Editpage())).click();
		System.out.println("Navigated to Edit Page");
		driver.findElement(By.xpath(pom.EditPassword())).sendKeys("psrvyb@22");
		driver.findElement(By.xpath(pom.EditConfirmPassword())).sendKeys("psrvyb@22");
		WebElement Name=driver.findElement(By.xpath(pom.EditName()));
		Name.clear();
		Name.sendKeys("Bindu Pillutula");
		WebElement Address=driver.findElement(By.xpath(pom.EditAddress()));
		Address.clear();
		Address.sendKeys("ReddyPalem,YSR Statue, Inner Ring Road");
		WebElement City=driver.findElement(By.xpath(pom.EditCity()));
		City.clear();
		City.sendKeys("Guntur");
		driver.findElement(By.xpath(pom.UpdatePage())).click();
		System.out.println("Sucessfully updated the page ");
		driver.findElement(By.xpath(pom.BookingsPage())).click();
		System.out.println("Navigated to Bookings Page");
		String Text=driver.findElement(By.xpath(pom.TotalBookings())).getText();
		System.out.println("Bookings are:  "+Text);
		driver.findElement(By.xpath(pom.LogoutPage())).click();
		System.out.println("Sucessfully Log out the page");
	}
	@AfterTest
	public void TestComplete() {
		System.out.println("Test is Completed");
		FlushTest();}
	}


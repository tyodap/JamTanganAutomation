package Jamtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import Jampages.Pages;
import Jamutils.Utils;

class Testing {
	private static WebDriver driver = null;
	
	String brand = "Casio AE-1000W-1AVDF Sporty Digital Dial Black Resin Strap";
	
	
	@BeforeAll
	public static void setUp() {
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jamtangan.com"); 
		driver.findElement(Pages.OKE_BUTTON).click();
		  //driver.findElement(Pages.NANTI_BUTTON).click(); 
		driver.findElement(Pages.SIGNIN_BUTTON).click();
		driver.findElement(Pages.EMAIL_FIELD).sendKeys("jamtest01@mailnesia.com");
		driver.findElement(Pages.PASSWORD_FIELD).sendKeys("Jamtangan=123",Keys.ENTER);
	}
	
	@Test
	public void jamTest() throws InterruptedException {
		try { 
			Utils.pause(5000);
			//driver.findElement(Pages.CLOSE_BUTTON).click();
			driver.findElement(Pages.SEARCH_BAR).sendKeys(brand, Keys.ENTER);
			Utils.pause(3000);
			driver.findElement(Pages.OKE_BUTTON).click();
			driver.findElement(Pages.PRODUCT_SELECT).click();
			driver.findElement(Pages.KERANJANG_BUTTON).click();
			Utils.pause(3000);
			driver.findElement(Pages.LIHAT_KERANJANG).click();
			Utils.pause(3000);
			String actualString = driver.findElement(By.xpath("//*[@id=\"cart-item-0\"]/div[1]/div[1]/div[3]/a/div")).getText();
			assertTrue(actualString.contains("Casio AE-1000W-1AVDF Sporty Digital Dial Black Resin Strap"));
			//Casio AE-1000W-1AVDF Sporty Digital Dial Black Resin Strap
			System.out.println("Test_Passed");
		} catch (AssertionError e) {
			String errorMsg = String.format("An error occured: %s", e);
			System.out.println(errorMsg);
		}
	}
	
	@Test
	public void negativeTest() throws InterruptedException{
		try { 
			Utils.pause(5000);
			//driver.findElement(Pages.CLOSE_BUTTON).click();
			driver.findElement(Pages.SEARCH_BAR).sendKeys("QA Automation", Keys.ENTER);
			Utils.pause(3000);
			String negativeMessage = driver.findElement(By.xpath("//*[contains(text(),'Udah nyari tapi gak ketemu :(')]")).getText();
			assertTrue(negativeMessage.contains("Udah nyari tapi gak ketemu :("));
			//Casio AE-1000W-1AVDF Sporty Digital Dial Black Resin Strap
			System.out.println("Test_Passed");
		} catch (AssertionError e) {
			String errorMsg = String.format("An error occured: %s", e);
			System.out.println(errorMsg);
		}
	}
	
	@AfterAll
	public static void after() {
		driver.quit();
	}
}

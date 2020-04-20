package Selenium_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionDemo {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionDemo abstractionDemo = new AbstractionDemo();
		abstractionDemo.login();
		abstractionDemo.goToAdmin();
		abstractionDemo.selectUserRole();
		abstractionDemo.clickOnSearchButton();
		// abstractionDemo.logout();
	}
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\exe\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
			
		}
	public void logout() {
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	public void goToAdmin() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	
	}
	
	public void selectUserRole() {
		Select dropdown = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		dropdown.selectByVisibleText("ESS");
	}
	public void clickOnSearchButton() {
		driver.findElement(By.id("searchBtn")).click();
	}
}

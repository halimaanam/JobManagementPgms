import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminSearchCompanies {
	@Test

public  void addcompany() throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //setting the property//Invoke .exe file

WebDriver driver = new ChromeDriver(); //Create driver object for chrome browser


//Hit URL on the browser
String url="https://linkedin-clone.itechscripts.com/admin";
driver.get(url);
System.out.println("You hit Url");

//String url="https://linkedin-clone.itechscripts.com/" //Hit URL on the browser
driver.get(url);
System.out.println("You hit the Google Url");

//maximize the screen
driver.manage().window().maximize();
System.out.println("Your Window is Maximized");

//Current URL
String curl = driver.getCurrentUrl();
System.out.println(curl);

//Title
String title = driver.getTitle();
System.out.println(title);

//Take SS
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("G://Screenshot.png"));

//Clear Email
driver.findElement(By.xpath("//input[@id='username']")).clear();

//Enter email
String email = "//input[@id='username']";
driver.findElement(By.xpath(email)).sendKeys("admin");
System.out.println("Entered the email");

//clearing password
 driver.findElement(By.xpath("//input[@id='password']")).clear();

 //Enter Password
String password = "//input[@id='password']";
driver.findElement(By.xpath(password)).sendKeys("admin");
System.out.println("Entered the password");
Thread.sleep(3000);

//Click Login
String login = "//button[normalize-space()='Log in']";
driver.findElement(By.xpath(login)).click();
System.out.println("Clicked on Login");
Thread.sleep(3000);

//Click on companies
String companies = "//span[normalize-space()='Companies']";
driver.findElement(By.xpath(companies)).click();
System.out.println("Clicked on companies");
Thread.sleep(3000);

//Click on companies listing
String companies1 = "//a[normalize-space()='Companies Listing']";
driver.findElement(By.xpath(companies1 )).click();
System.out.println("Clicked on companies listing");
Thread.sleep(3000);

//Click on search
String search = "//input[@type='search']";
driver.findElement(By.xpath(search)).click();
System.out.println("Clicked on search");
Thread.sleep(3000);

//Adding data in search box
String search3="//input[@type='search']";
driver.findElement(By.xpath(search3)).sendKeys("Ibm");
System.out.println("Clicked on search");
Thread.sleep(5000);


//Click on membership plan
String membership = "//a[normalize-space()='Membership Plan']";
driver.findElement(By.xpath(membership)).click();
System.out.println("Clicked on membership plan");
Thread.sleep(3000);

//Post a package name 
String packagename="//input[@id='package_name']";
driver.findElement(By.xpath(packagename)).sendKeys("test");
System.out.println("Clicked on package name");
Thread.sleep(3000);

//Post package price 
String packageprice="//input[@id='price']";
driver.findElement(By.xpath(packageprice)).sendKeys("50,000");
System.out.println("Clicked on package price");
Thread.sleep(3000);

//Post jobpost limit
String jobpost ="//input[@id='job_post']";
driver.findElement(By.xpath(jobpost)).sendKeys("150");
System.out.println("Clicked on jobpost");
Thread.sleep(3000);

//Post group create limit
String grouplimit ="//input[@id='group_create']";
driver.findElement(By.xpath(grouplimit)).sendKeys("200");
System.out.println("Clicked on grouplimit");
Thread.sleep(3000);

//Post company create limit
String companylimit ="//input[@id='company_create']";
driver.findElement(By.xpath(companylimit)).sendKeys("5");
System.out.println("Clicked on companylimit");
Thread.sleep(3000);

//Select a profile view check
WebElement dropDown1=driver.findElement(By.xpath("//select[@id='profile_view_check']"));
Select item1=new Select(dropDown1);
item1.selectByValue("1");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);


//Click on add button
String add="//input[@name='submit']";
driver.findElement(By.xpath(add)).click();
System.out.println("Clicked on add");
Thread.sleep(5000);
	
//Click on logout
String logout="//a[contains(text(),'Logout')]";
driver.findElement(By.xpath(logout)).click();
Thread.sleep(3000);	

driver.close();
	}
}

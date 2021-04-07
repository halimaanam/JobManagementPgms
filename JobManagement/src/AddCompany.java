import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddCompany {
	private WebElement dropDown;

	@Test

public void addcompany() throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //setting the property//Invoke .exe file

WebDriver driver = new ChromeDriver(); //Create driver object for chrome browser


//Hit URL on the browser
String url="https://linkedin-clone.itechscripts.com/";
driver.get(url);
System.out.println("You hit the Flipkart Url");

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

//Enter Email
String email = "login_email";
driver.findElement(By.id(email)).clear();
driver.findElement(By.id(email)).sendKeys("userdemo@yourmail.com");
System.out.println("Entered the email");

//Enter Password
String password = "login_password";
driver.findElement(By.id(password)).clear();
driver.findElement(By.id(password)).sendKeys("userdemo");
System.out.println("Entered the password");

//Click Login
String login = "//a[normalize-space()='Log in']";
driver.findElement(By.xpath(login)).click();
System.out.println("Clicked on Login");
Thread.sleep(3000);

//Click on company
String company="//a[normalize-space()='Companies']";
driver.findElement(By.xpath(company)).click();
System.out.println("Clicked on company");
	
//Click on PostCompanies
String postcompanies="//a[normalize-space()='Post Company']";
driver.findElement(By.xpath(postcompanies)).click();
System.out.println("Clicked on PostCompanies");
Thread.sleep(6000);

//Post a job
String companyname="//input[@id='cmp_name']";
driver.findElement(By.xpath(companyname)).sendKeys("Mindsnxt");
System.out.println("Entered companyname");
Thread.sleep(3000);

//Post a companytype
String companytype="//input[@id='cmp_type']";
driver.findElement(By.xpath(companytype)).sendKeys("IT");
System.out.println("Entered companytype");
Thread.sleep(3000);

//Post a website
String website="//input[@id='website']";
driver.findElement(By.xpath(website)).sendKeys("www.mindsnxt.com");
System.out.println("Entered the website");
Thread.sleep(3000);
	
//Post contact no
String contact="//input[@id='telephone']";
driver.findElement(By.xpath(contact)).sendKeys("08472223344");
System.out.println("Entered the contactno");
Thread.sleep(3000);

//Post an email
String email1="//input[@id='cmp_email']";
driver.findElement(By.xpath(email1)).sendKeys("mindsnxt123@gmail.com");
Thread.sleep(3000);

//Post an established year
String establishedyear="//input[@id='established']";
driver.findElement(By.xpath(establishedyear)).sendKeys("1995");
Thread.sleep(3000);	
	
//Select a country
WebElement dropDown=driver.findElement(By.xpath("//select[@id='country']"));
//dropDown.click();
Select item=new Select(dropDown);
item.selectByValue("1");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Select a city
WebElement dropDown1=driver.findElement(By.xpath("//select[@id='city']"));
//dropDown1.click();
Select item1=new Select(dropDown1);
item1.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);


//Post a facebookpage
String facebookpage="//input[@id='facebook']";
driver.findElement(By.xpath(facebookpage)).sendKeys("Moisture mavens");
Thread.sleep(3000);

//Post a twitterpage
String twitterpage="//input[@id='twitter']";
driver.findElement(By.xpath(twitterpage)).sendKeys("Mavens");
Thread.sleep(3000);

//Post a youtubechannel
String youtubechannel="//input[@id='youtube']";
driver.findElement(By.xpath(youtubechannel)).sendKeys("Beyond Science");
Thread.sleep(3000);

//Post a description
String description="//textarea[@id='cmp_desc']";
driver.findElement(By.xpath(description)).sendKeys("Mindsnxt focuses on global parternships for growth and services excellence");
Thread.sleep(3000);

//Post an address
String address="//input[@id='type']";
driver.findElement(By.xpath(address)).sendKeys("Worli sealink");
Thread.sleep(3000);

//Scrolling Page Down
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");//Script,Arguments
System.out.println("You scrolled Down");

//Post an image
WebElement upload=driver.findElement(By.xpath("//input[@id='cmp_image']"));
upload.sendKeys("G:\\logo.png");
Thread.sleep(1000);


//Add button
String addbutton="//button[normalize-space()='Post Company']";
driver.findElement(By.xpath(addbutton)).click();
System.out.println("Clicked on addbutton");
Thread.sleep(5000);

//Click on company
String company1="//a[normalize-space()='Companies']";
driver.findElement(By.xpath(company1)).click();
System.out.println("Clicked on company");
Thread.sleep(3000); 
	

//Click on postedcompanies
String postedcompany="//a[normalize-space()='Posted Companies']";
driver.findElement(By.xpath(postedcompany)).click();
System.out.println("Clicked on postedcompany");
Thread.sleep(3000);

//Click on search
String search="//input[@id='company']";
driver.findElement(By.xpath(search)).sendKeys("Mindsnxt");
Thread.sleep(3000);	
	
//Click on myaccounts
String myaccounts="//a[normalize-space()='My Accounts']";
driver.findElement(By.xpath(myaccounts)).click();
Thread.sleep(3000);	

//Click on logout 
String logout="//a[normalize-space()='Logout']";
driver.findElement(By.xpath(logout)).click();
Thread.sleep(3000);	
}
}

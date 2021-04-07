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

public class AddJob {
	@Test

public  void addcompany() throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); //setting the property//Invoke .exe file

WebDriver driver = new ChromeDriver(); //Create driver object for chrome browser


//Hit URL on the browser
String url="https://linkedin-clone.itechscripts.com/";
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

//Click on job
String job="//a[@role='button'][normalize-space()='Jobs']";
driver.findElement(By.xpath(job)).click();
System.out.println("Clicked on job");

//Click on postjob
String postjob="//a[normalize-space()='Post Job']";
driver.findElement(By.xpath(postjob)).click();
System.out.println("Clicked on PostCompanies");
Thread.sleep(6000);

//Click on jobtitle
String jobtitle="//input[@id='job_title']";
driver.findElement(By.xpath(jobtitle)).sendKeys("Software engineer");
System.out.println("Entered jobtitle");
Thread.sleep(3000);

//Click on company
WebElement dropDown=driver.findElement(By.cssSelector("#company"));
dropDown.click();
Select item=new Select(dropDown);
item.selectByVisibleText("Nokia");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);


//Click on country
WebElement dropDown1=driver.findElement(By.xpath("//select[@id='country']"));
//dropDown.click();
Select item1=new Select(dropDown1);
item1.selectByValue("2");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Select a city
WebElement dropDown2=driver.findElement(By.xpath("//select[@id='city']"));
//dropDown1.click();
Select item11=new Select(dropDown2);
item11.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Select a job type
WebElement dropDown3=driver.findElement(By.xpath("//select[@id='job_type']"));
//dropDown1.click();
Select item111=new Select(dropDown3);
item111.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Post a role
String role="//input[@id='role']";
driver.findElement(By.xpath(role)).sendKeys("Project management");
System.out.println("Entered the role");
Thread.sleep(3000);

//Post experience
String experience="//input[@id='experience']";
driver.findElement(By.xpath(experience)).sendKeys("12 months experienced");
System.out.println("Entered the experienced");
Thread.sleep(3000);

//Post salary
String salary="//input[@id='salary']";
driver.findElement(By.xpath(salary)).sendKeys("2,12,000");
System.out.println("Entered the salary");
Thread.sleep(3000);

//Post a field
WebElement dropDown4=driver.findElement(By.xpath("//select[@id='functions']"));
//dropDown1.click();
Select item1111=new Select(dropDown4);
item1111.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Post an industry
WebElement dropDown5=driver.findElement(By.xpath("//select[@id='industry']"));
//dropDown1.click();
Select item11111=new Select(dropDown5);
item11111.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
System.out.println("You selected dropdown value");
Thread.sleep(3000);

//Post a description
String description="//textarea[@id='description']";
driver.findElement(By.xpath(description)).sendKeys("Develops information systems by designing,developing, and installing software solutions.");
Thread.sleep(3000);

//Post a keyskill
String keyskill="//textarea[@id='key_skill']";
driver.findElement(By.xpath(keyskill)).sendKeys("Oracle,PHP, Java");
Thread.sleep(3000);

//Post a skill
String skill="//textarea[@id='skill']";
driver.findElement(By.xpath(skill)).sendKeys("Problem solving and logical thinking, Object-oriented design, Software testing etc.");
Thread.sleep(3000);

//Post contact preferences
String contactpreferences="//textarea[@id='contact_preferences']";
driver.findElement(By.xpath(contactpreferences)).sendKeys("via mail,phone call etc.");
Thread.sleep(3000);

//Post keyword
String keyword="//textarea[@id='keyword']";
driver.findElement(By.xpath(keyword)).sendKeys("Job management");
Thread.sleep(3000);

//Add postbutton
String postbutton="//button[normalize-space()='Post job']";
driver.findElement(By.xpath(postbutton)).click();
System.out.println("Clicked on postbutton");
Thread.sleep(5000);

//Click on job
String job1="//a[@role='button'][normalize-space()='Jobs']";
driver.findElement(By.xpath(job1)).click();
System.out.println("Clicked on job");
Thread.sleep(3000); 
	
//Click on findjob
String findjob="//a[normalize-space()='Find Job']";
driver.findElement(By.xpath(findjob)).click();
System.out.println("Clicked on findjob");
Thread.sleep(3000); 

//Click on postedjobs
String postedjobs="//a[normalize-space()='Post Job']";
driver.findElement(By.xpath(postedjobs)).click();
System.out.println("Clicked on postedjobs");
Thread.sleep(3000);	

//Click on search
String search="//input[@id='keyword']";
driver.findElement(By.xpath(search)).sendKeys("Software engineeer");
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







package com.hub.TestNGscript;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.hub.PageFactory.Hubcodes;
import com.hub.TestDataEngine.Testexcel;
import com.hub.Utilities.Browsercodings;
import com.hub.Utilities.Constant;
import com.hub.Utilities.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
@Listeners(com.hub.Log4jproperties.TestNGListerner.class)
public class HubTest {
	ExtentReports report;//global variables
	ExtentTest logger;

    public static WebDriver driver;
    
  @Test(priority=0,dataProvider="Test")
  public void Signin(String user,String pass) throws IOException, InterruptedException, ParseException {
	  report=new ExtentReports("D:\\Reports\\event.html",true);
	  logger=report.startTest("BusinessVerifyLogin");
	  Hubcodes obj = PageFactory.initElements(driver, Hubcodes.class);
	  obj.login(user, pass);
	  logger.log(LogStatus.INFO, "Logins the application successfully");
	  
  }
	 @Test(priority=1,enabled=false)
	 public void Eventtest() throws InterruptedException, IOException {
	logger=report.startTest("VerifyEventModule without Entering Address Fields");
	Hubcodes objs = PageFactory.initElements(driver, Hubcodes.class);
	 objs.Events(Constant.EventTitle,Constant.Description);
	 objs.Datetime();
	 Thread.sleep(5000);
	 objs.selectregion();
	 Alert alert = driver.switchTo().alert();		
	 String alertMessage= driver.switchTo().alert().getText();	 // Capturing alert message.  	
	 System.out.println(alertMessage);// Displaying alert message	
	 Thread.sleep(8000);
	 logger.log(LogStatus.INFO, "Capturing Alert Message");
	 alert.accept();		
	  objs.Event2("123456789", "dddd@gmail.com", "Foyals");
	  Thread.sleep(5000);
	  String title1 = driver.getTitle();
     System.out.println(title1);
     Thread.sleep(2000);
     String actual_error1=driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]")).getText();
	  String expected_error1="";
     Assert.assertEquals(actual_error1, expected_error1);
     Assert.assertTrue(actual_error1.contains("This field is required."));
     System.out.println("Address Field is Required");
	//  ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
     
      logger.log(LogStatus.INFO, "Address Field is Required For create Event");
	 
   	}
@Test(priority=2,enabled=false)
public void Eventtest1() throws IOException, InterruptedException {
	 logger=report.startTest("Checking all the Possibilites of CreateEvent Field");
	  Hubcodes obj1 = PageFactory.initElements(driver, Hubcodes.class);
	  obj1.Eventdes(Constant.EventTitle, Constant.Description);
	  logger.log(LogStatus.INFO, "Entering Only the Title and Description and Click Submit"); 
      obj1.Event31("AnotherEvent", Constant.Description);
      logger.log(LogStatus.INFO, "Entering the Title,Description and Uploading Logo Image,Click Submit"); 
      obj1.Event41("AnotherEvent", Constant.Description);
      logger.log(LogStatus.INFO, "Entering the Title,Description,Uploading Logo Image,StartDate and EndDate,Click Submit"); 
      obj1.Event51("AnotherEvent", Constant.Description);
      logger.log(LogStatus.INFO, "Entering the Title,Description,Uploading Logo Image,StartDate,EndDate, Start and End Timings,Click Submit"); 
      obj1.Event61("AnotherEvent",Constant.Description);
      logger.log(LogStatus.INFO, "Entering the Title,Description,Uploading Logo Image,StartDate,EndDate,Start ,End Timings, Region and District,Click Submit"); 
      obj1.Event71("AnotherEvent", Constant.Description,"Newzealand");
      logger.log(LogStatus.INFO, "Without Entering Email,ContactNumber and ContactName,Click Submit"); 
      obj1.Event81("AnotherEvent", Constant.Description,"Newzealand","********");
      logger.log(LogStatus.INFO, "Without Entering Email and ContactName,Click Submit"); 
      obj1.Event91("AnotherEvent", Constant.Description,"Newzealand","222222222", "hgghfhg@gmail.com");
      logger.log(LogStatus.INFO, "Without Entering ContactName,Click Submit"); 
       String actual_error1=driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]")).getText();
	  String expected_error1="";
      Assert.assertEquals(actual_error1, expected_error1);
      Assert.assertTrue(actual_error1.contains("This field is required."));
  //   System.out.println("Address Field is Required");
	//  ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
      logger.log(LogStatus.INFO, "Create Event checked with Different scenarios with submit");     
}
  
  @Test(priority=3,enabled=false)
  public void Eventtest2() throws InterruptedException {
	  logger=report.startTest("VerifyEventModule Only Enters Title and submit");
	  Hubcodes obj2 = PageFactory.initElements(driver, Hubcodes.class);
	  obj2.Eventtitle("Eventday");
	  String title1 = driver.getTitle();
      System.out.println(title1);
      Thread.sleep(2000);
      String actual_error1=driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]")).getText();
	  String expected_error1="";
      Assert.assertEquals(actual_error1, expected_error1);
      Assert.assertTrue(actual_error1.contains("This field is required."));
      System.out.println("Address Field is Required");
      ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
      logger.log(LogStatus.INFO, "Fields are missing for create event");
  }
  @Test(priority=4,enabled=false)
  public void Eventtest3() throws InterruptedException, IOException, FindFailed {
	  logger=report.startTest("Event submitted with All Fields");
	  Hubcodes obj2 = PageFactory.initElements(driver, Hubcodes.class);
	  obj2.Events("GameEvent!!!", Constant.Description);
	  obj2.Datetime();
	  Thread.sleep(7000);
	  obj2.selectregion1("Newzealand");
	  obj2.Event3("123456789", "dddd@gmail.com", "Foyals");
	  Thread.sleep(5000);
      String title1 = driver.getTitle();
      System.out.println(title1);
      Thread.sleep(2000);
      String actual_error1=driver.findElement(By.xpath("//li//a[contains(text(),'My Event')]")).getText();
	  String expected_error1="My Event";
      Assert.assertEquals(actual_error1, expected_error1);
      Assert.assertTrue(actual_error1.contains("My Event"));
      System.out.println("Event created successfully");
  //    ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
      logger.log(LogStatus.INFO, "Event Created Successfully");
    //  obj2.logout();
      logger.log(LogStatus.INFO, "Logouts the BusinessLogin");////p[contains(text(),'GoodEvent')]
  }
  @Test(priority=5,dataProvider="getData",enabled=false)
  public void Signin2(String user,String pass) throws IOException, InterruptedException, ParseException, FindFailed {
	
	   logger=report.startTest("VerifyLogin for YouthLogin");
	   Hubcodes obj3 = PageFactory.initElements(driver, Hubcodes.class);
	   obj3.login2(user, pass);
	   logger.log(LogStatus.INFO, "Logins the application as Youth Successfully");
	   obj3.youthevent();
	   String actual_error1=driver.findElement(By.xpath("//p[contains(text(),'GameEvent!!!')]")).getText();
	   String expected_error1="GameEvent!!!";
	   Assert.assertEquals(actual_error1, expected_error1);
	   Assert.assertTrue(actual_error1.contains("GameEvent!!!"));
	   Thread.sleep(8000);
	   obj3.youthevent2();
	   String title2 = driver.getTitle();
	   System.out.println(title2);
      logger.log(LogStatus.INFO, "Successfully Youth Can view the Events Posted By Business");
   
        
   
  }
@Test (priority=6,enabled=false)
public void Myevent() throws InterruptedException, IOException, FindFailed, AWTException {
	 logger=report.startTest("Checks the Event title Filter on MyEvent Page");
	  Hubcodes obj4 = PageFactory.initElements(driver, Hubcodes.class);
	 obj4.myevent("Eventnowadays", "356555555", "!@#$%^&*()_+","ASssddf2323.343","GameEvent!!!");
	 logger.log(LogStatus.INFO, "Successfully Tests the Title search Field");
	 driver.navigate().to("http://demo1.youthhub.com/event/edit/1275170");
    obj4.editevent("GameEvent!!!",Constant.Edited);
     logger.log(LogStatus.INFO, "Successfully Event edited and Updates the Event");
     driver.navigate().to("http://demo1.youthhub.com/event/edit/1275170");
     obj4.editevent1();
     logger.log(LogStatus.INFO, "Event updated without Entering event title and description");
	  String actual_error1=driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]")).getText();
	  String expected_error1="";
      Assert.assertEquals(actual_error1, expected_error1);
      Assert.assertTrue(actual_error1.contains("This field is required."));
      
}
@Test(priority=7,enabled=false)
public void EditedEventUpdated() throws IOException, InterruptedException {
logger=report.startTest("Checks the Event title Filter on MyEvent Page");
Hubcodes obj5 = PageFactory.initElements(driver, Hubcodes.class);
       obj5.editevent2("GameEvent!!!", Constant.Edited);
      obj5.Date3();
     // obj5.Date4();
      obj5.selectregion1("Christchurch,Newzealand");
      obj5.editevent2_1("8682942036", "Gudduganesh@gmail.com", "Franklin");
      logger.log(LogStatus.INFO, "Event Edited and Updated Successfully");
     String actual_error2=driver.findElement(By.xpath("p[contains(text(),'GameEvent!!!')]")).getText();
	 String expected_error2="GameEvent!!!";
     Assert.assertEquals(actual_error2, expected_error2);
     Assert.assertTrue(actual_error2.contains("GameEvent!!!"));
}
	  
@Test(priority=8)
public void Myevent2() throws InterruptedException ,StaleElementReferenceException {
	 logger=report.startTest("Checks the Event title Filter and Region/city  checkbox on MyEvent Page");
	  Hubcodes obj6 = PageFactory.initElements(driver, Hubcodes.class);
	  obj6.event_test("testing3");
	  logger.log(LogStatus.INFO, "All the Filters and Region checkboxes are Tested successfully");
	  obj6.event_regionfilter();
	//  obj6.event_cityfilter();
	  logger.log(LogStatus.INFO, "All the Region/city checkboxes are Tested successfully");
	obj6.allevent("Conversations in Confidence Course Dec 2018.");
	logger.log(LogStatus.INFO, "Switches page from Myevents to AllEventlist page sucessfully");
	
	     }
	 

  @Test(priority=9,enabled=false)
  public void ExploreTest() throws InterruptedException, FindFailed {
	  logger=report.startTest("VerifyExploreModule");
	  Hubcodes obj2 = PageFactory.initElements(driver, Hubcodes.class);
	  obj2.Explore2("Toi","!~!@#$%^&*()_+","123.22.555.");
	  obj2.expl();
	

  }
 
	 

  @BeforeClass
  public static void beforeMethod() {
	  driver = Browsercodings.Browserfact("chrome", "http://demo1.youthhub.com/");
  }

  
  @AfterMethod
  public void afterMethod(ITestResult result) {
	  if (result.getStatus() == ITestResult.FAILURE) {
	  logger.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	  } else if (result.getStatus() == ITestResult.SKIP) {
	  logger.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	  } else {
	 logger.log(LogStatus.PASS, "Test passed");
	 report.endTest(logger);
	  }
  }
	     
	  
	  @AfterTest
	  public void endReport()
	  {
	  report.flush();
	  report.close();
	  }
	  
  @DataProvider
  public Object[][] Test() {
	  Testexcel RR = new Testexcel("D:\\GaneshBackup\\Eclipse workspace\\Hub\\src\\com\\hub\\TestData\\Login Data.xlsx");
	//  Testexcel RR= new Testexcel("D:\\GaneshBackup\\Eclipse workspace\\Hub\\src\\com\\hub\\TestData\\Youthlogin.xlsx");
  	   int rows = RR.getrowgount(0);
  	   Object [][] data = new Object [rows][2];
  	   for(int i=0;i<rows;i++)
  	   {
  		   data[i][0] = RR.getData(0, i, 0);
  		   data[i][1]= RR.getData(0, i,1);
  		
  		   
  		   }
  	   return data;
  	  }
  @DataProvider
 public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[1][2];

	// 1st row
	data[0][0] = Constant.UserName;
	data[0][1] = Constant.Password;


	
	return data;
	}
}


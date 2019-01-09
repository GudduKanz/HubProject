package com.hub.PageFactory;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Hubcode {
static Logger log = Logger.getLogger( Hubcode.class.getName());
	
	{ 
		PropertyConfigurator.configure("C:\\Users\\jaisumalatha\\eclipse-workspace\\Explore\\Log4j.properties");
	}
	public static WebDriver driver;
	//private WebDriver para;

	@SuppressWarnings("static-access")
	public  Hubcode (WebDriver idriver)
{

this.driver =idriver;

}
	/////////////////////////Events for Business////////////////////
	@FindBy(name="identity") WebElement id;
	@FindBy(name="password") WebElement pss;
	@FindBy(xpath="//button[text()='Login' and @type='submit' and @class='btn login_btn d-sm-none d-none d-lg-inline-block']") WebElement lg;
	@FindBy(xpath="//input[@class='btn float-right btn_login']") WebElement lg2;
    @FindBy(xpath="//*[@id=\"mySidenav\"]/div/div/a[4]/div/div") WebElement ev;
	@FindBy(xpath="/html/body/div/div[4]/div[1]/div/ul/li[2]/a") WebElement addev;
	@FindBy(name="em_title") WebElement ttl;
	@FindBy(name="em_detail") WebElement des;
	@FindBy(name="em_logo") WebElement logo;
	@FindBy(name="em_start_date") WebElement st;
	@FindBy(xpath="/html/body/div[5]/div[3]/ul[3]/li[26]") WebElement stpick;
	@FindBy(name="em_end_date") WebElement end;
	@FindBy(xpath="/html/body/div[5]/div[3]/ul[3]/li[27]") WebElement endpick;//
	@FindBy(name="em_start_time") WebElement sttime;
	@FindBy(xpath="/html/body/div[2]/div[3]/div[1]/div[2]") WebElement stpicktime;
	@FindBy(name="em_end_time") WebElement endtime;
	@FindBy(xpath="/html/body/div[3]/div[3]/div[3]/a") WebElement am;
	@FindBy(xpath="/html/body/div[3]/div[3]/div[1]/div[2]") WebElement endpicktime;
	@FindBy(name="em_re_region_id") WebElement slrg;
	@FindBy(name="em_ci_city_id") WebElement slct;
	@FindBy(id="em_address") WebElement add;
	@FindBy(id="findmaplocation") WebElement findlc;
	@FindBy(name="em_contact_no") WebElement conem;
	@FindBy(name="em_contact_email") WebElement conemail;
	@FindBy(name="em_contact_name") WebElement connam;
	///////////////////////////youthevent////////////////////////
	@FindBy(name="search_name") WebElement nmm;
	@FindBy(xpath="//a[@href='#allevents']") WebElement allevents;
	@FindBy(xpath="//a[@href='http://demo1.youthhub.com/event']") WebElement yev;
	@FindBy(xpath="//*[@id=\"YB_event_list_1\"]/div[1]/div/div[2]/div[1]/div[2]/a/p") WebElement Moredetails;
	////////////////////////Explore///////////////////////////////
	@FindBy(xpath="//*[@id=\"mySidenav\"]/div/div/a[5]") WebElement ex;
	@FindBy(xpath="/html/body/div/div[4]/div[1]/ul/li[2]/a") WebElement addex;
	@FindBy(id="xm_title") WebElement tt;
	@FindBy(id="xm_description") WebElement td;
	@FindBy(id="xt_title") WebElement ttl2;
	@FindBy(xpath="//*[@id=\"YB_explore_add_form\"]/div[2]/div[1]/div[4]/div/div/div[2]") WebElement txt;
	@FindBy(id="content_4") WebElement cnt;
	@FindBy(css="div.border_box:nth-child(3) > div:nth-child(1) > button:nth-child(1)") WebElement clk1;
	@FindBy(xpath="//button[text()='Submit']") WebElement sbt;
	@FindBy(css="ul.timeline:nth-child(2) > li:nth-child(2) > a:nth-child(2)") WebElement ccl;
	///////////////////////////////////////nnn////////////////////////////////
	@FindBy(xpath="//i[(@class='fa fa-bars icn_bars')]") WebElement menu;
	@FindBy(xpath="//a[@href='http://demo2.tradezap.com/explore']") WebElement explore;
	@FindBy(id="search_name") WebElement nme;
	@FindBy(id="rating") WebElement rating1;
	@FindBy(xpath="//input[contains(@class,'fstQueryInput fstQueryInputExpanded')]") WebElement selecttag;
	@FindBy(id="content_type") WebElement tag;
	@FindBy(xpath="//span[contains(@class,'fstResultItem')]") WebElement resulttag;
	@FindBy(xpath="//button[contains(@class,'fstChoiceRe"
			+ "move')]") WebElement cleartag;
	@FindBy(xpath="//button[contains(@class,'btn_filter btn YB_explore_filter search_project')]") WebElement applyfilter;
	@FindBy(xpath="//a[(@href='http://demo2.tradezap.com/explore/8978120' and @title='Mytitile')]") WebElement clickexplore;
	@FindBy(xpath="//a[contains(@class,'YB_add_my_explore')]") WebElement addremexpl;
	@FindBy(xpath="//*[@href='#allevents']") WebElement myexplore;
	@FindBy(xpath="//*[text()='Select']") WebElement ratingselect;
	@FindBy(xpath="//a[@href='#mylocation']") WebElement sharedexplore;
	@FindBy(xpath="//img[@class='img-fluid profile_logo d-inline-block']") WebElement logout;
	@FindBy(xpath="//button[contains(text(),'Logout')]") WebElement logout1;
		////////////////////////////////////////////////////Connections////////////////////////
	@FindBy(xpath="//a[contains(@href,'http://demo2.tradezap.com/connection')]") WebElement connect;
	//@FindBy(id="name") WebElement
	///////////////////////////////////////my event////////////////////////////
	@FindBy(name="search_name") WebElement title;
	@FindBy(name="region_id[]") WebElement region;
	@FindBy(name="city_id[]") WebElement city;
	@FindBy(xpath="//a[@href='#allevents']") WebElement allevent;
	//@FindBy(xpath="//*[contains(text(),'Conversations in Confidence Course Dec 2018.')]") WebElement 
	@FindBy(xpath="//span[@class='YB_clear float-right mt-3 mr-0 YB_clear1']") WebElement regionrefresh;
	@FindBy(xpath="//a[@class=' text_theme']") WebElement cl;
	//////////////////////////////////////Edit Event/////////////////////////////
	@FindBy(xpath="//a[text()='GameEvent!!!']") WebElement eventclick;
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn_dropdwn']") WebElement edit;
	@FindBy(xpath="//a[text()=' Edit']") WebElement editoptionclick;
	@FindBy(xpath="//button[text()='Update']") WebElement updateeditedevent;
	//////////////////////////youth-event operations////////////////////////////////
	@FindBy(xpath="//button[contains(text(),'Count Me In')]") WebElement countin;
	@FindBy(xpath="//a[text()='Photo']") WebElement photo;
	@FindBy(xpath="//a[text()='Video']") WebElement video;
	@FindBy(xpath="//a[text()='Discussion ']") WebElement discussion;
	@FindBy(xpath="//input[contains(@class,'msg_box small_font w-75 YB_msg_send')]") WebElement sendmessage;
	@FindBy(xpath="//i[@class='fas fa-angle-right float-right send_msg YB_send_msg cursor']") WebElement sendbutton;
	

	
	
	
	///////Login from HomePage////////
	public void login(String user,String pass) {
		id.sendKeys(user);
		pss.sendKeys(pass);
		lg.click();
		//ev.click();
		//addev.click();
	
	}
	////////////Login////////////
	public void login2(String user,String pass) {
		id.sendKeys(user);
		pss.sendKeys(pass);
		lg2.click();
	
		//ev.click();
		//addev.click();
	
	}
	//////////Add Event////////////////////
	public void Events(String title,String description) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		Thread.sleep(8000);
		driver.navigate().refresh();
		ttl.sendKeys(title);//
		des.sendKeys(description);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
	}
	///////////////////Add Event for Shadowtech//////////////
	public void ShadowEvents(String title,String description) throws IOException, InterruptedException, AWTException {
		ev.click();
		addev.click();
		Robot robot = new Robot();
		// press key Ctrl+Shift+r
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_R);
		// relase key Ctrl+Shift+r
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_R);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_R);
		// relase key Ctrl+Shift+r
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_R);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_R);
		// relase key Ctrl+Shift+r
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_R);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(10000);
        ttl.sendKeys(title);//
		des.sendKeys(description);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
	}
	/////////////////Datetime for Event/////////////////
	public void Datetime() throws InterruptedException  , NumberFormatException {
 driver.findElement(By.name("em_start_date")).click();
 Thread.sleep(7000);
 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
 fromDateBox.sendKeys("2019/01/05"); 
		  
   driver.findElement(By.name("em_end_date")).click();
   Thread.sleep(8000);
   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
   fromDateBox2.sendKeys("2019/01/25");
   driver.findElement(By.name("em_end_date")).click();
		 
    driver.findElement(By.name("em_start_time")).click();
	JavascriptExecutor js2 = (JavascriptExecutor)driver;
	js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
	Thread.sleep(8000);
	driver.findElement(By.name("em_end_time")).click();
	JavascriptExecutor js3 = (JavascriptExecutor)driver;
	js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
	Thread.sleep(8000);
	}
//////////////datetime for event/////////////////////////////////////
	public void Datetime2() throws InterruptedException   {
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		WebElement elementName = driver.findElement(By.name("em_start_date"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", elementName);
		elementName.clear();
		elementName.sendKeys("19/12/2018");                   
		Thread.sleep(8000);
		driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		WebElement elementName1 = driver.findElement(By.name("em_end_date"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", elementName1);
		elementName1.clear();
		elementName1.sendKeys("30/12/2018");                   
		Thread.sleep(8000);
		
		
		        	
	}

	public void Date3() throws InterruptedException {
		driver.findElement(By.name("em_start_date")).click(); 
		Thread.sleep(8000);
		String month="December 2018";
		// String date= "18";
		  WebElement mon = driver.findElement(By.xpath("//li[contains(@data-view,'month current')]"));
		       Thread.sleep(8000);
		        while(true) {
			                if(mon.getText().equals(month)){
			                     	break;}
		              else {
			                   driver.findElement(By.xpath("//li[contains(@data-view,'month next')]")).click();
		                                 }}

			//driver.findElement(By.xpath("//*[contains(text(),'"+date+"')]")).click();
		      driver.findElement(By.xpath("//li[text()='22']")).click();
			Thread.sleep(8000);
		}
	
	
	
		public void Date4() throws InterruptedException {
		driver.findElement(By.name("em_end_date")).click(); 
		Thread.sleep(5000);
		String month="December 2018";
		// String date= "27";
		  WebElement mon = driver.findElement(By.xpath("//li[contains(@data-view,'month current')]"));
		         Thread.sleep(8000);
		        while(true) {
			                if(mon.getText().equals(month)){
			                     	break;}
		              else {
			                   driver.findElement(By.xpath("/html/body/div[46]/div[3]/ul[1]/li[3]")).click();
			                   Thread.sleep(8000);
		                                 }}
		     //   driver.findElement(By.xpath("/html/body/div[46]/div[3]/ul[3]/li[14]")).click();
			      driver.findElement(By.xpath("//li[text()='27']")).click();

			Thread.sleep(8000);
		
	}
		/////////////For Selecting Region in add event//////////////
	public void selectregion() throws InterruptedException {
		Select select=new Select(slrg);
		select.selectByIndex(1);
		Thread.sleep(3000);
		Select select1=new Select(slct);
		select1.selectByIndex(1);
		Thread.sleep(3000);
		//add.sendKeys(address);
		findlc.click();
		Thread.sleep(3000);
	}
/////////////For Selecting Region in add event//////////////
	public void selectregion1(String address) throws InterruptedException {
		Select select=new Select(slrg);
		select.selectByIndex(3);
		Thread.sleep(3000);
		Select select1=new Select(slct);
		select1.selectByIndex(2);
		Thread.sleep(3000);
		add.sendKeys(address);
		findlc.click();
		Thread.sleep(3000);
	}
/////////////Contact name,email,number for add event//////////////
	public void Event2(String contact,String email,String name) throws InterruptedException {
	    conem.sendKeys(contact);
		conemail.sendKeys(email);
		connam.sendKeys(name);
		clk1.click();
	}
	public void youthevent() throws InterruptedException {
		menu.click();
		Thread.sleep(8000);
		yev.click();
		Thread.sleep(2000);
		allevents.click();
		Thread.sleep(2000);
		
		
		
	}
	public void youthevent2(String message) throws InterruptedException {
		Moredetails.click();
		Thread.sleep(5000);
		countin.click();
		Thread.sleep(2000);
		photo.click();
		Thread.sleep(2000);
		video.click();
		Thread.sleep(2000);
		discussion.click();
		Thread.sleep(2000);
		sendmessage.sendKeys(message);
		Thread.sleep(2000);
		sendbutton.click();
		Thread.sleep(2000);
		
	}
	public void Sikuli() throws FindFailed, InterruptedException {
		Alert alert = driver.switchTo().alert();
		Screen screen=new Screen ();
		Pattern alert1 =new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\alert.png");
         screen.click(alert1);
		screen.wait(alert1,5000);
	 
		
	  
		
	}
	
public void Event3(String contact,String email,String name) throws InterruptedException {
	    
	  // add.sendKeys(address);
	    conem.sendKeys(contact);
		conemail.sendKeys(email);
		connam.sendKeys(name);
		clk1.click();
	}
	public void Eventtitle(String title) {
		ev.click();
		addev.click();
		ttl.sendKeys(title);
		//sbt.click();
		clk1.click();
	}
	public void Eventdes(String title,String descri) {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		clk1.click();
	}
	public void Event31(String title,String descri) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		clk1.click();
	}
	public void Event41(String title,String descri) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/05"); 
        driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/09");
		   driver.findElement(By.name("em_end_date")).click();
		clk1.click();
	}
	public void Event51(String title,String descri) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/05"); 
	       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/09");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			clk1.click();
	}
	public void Event61(String title,String descri) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/05"); 
	       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/09");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			Select select=new Select(slrg);
			select.selectByIndex(5);
			Thread.sleep(3000);
			Select select1=new Select(slct);
			select1.selectByIndex(2);
			Thread.sleep(3000);
		     clk1.click();
	}
	
	public void Event71(String title,String descri,String address) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/05"); 
	       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/09");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			Select select=new Select(slrg);
			select.selectByIndex(1);
			Thread.sleep(3000);
			Select select1=new Select(slct);
			select1.selectByIndex(1);
			Thread.sleep(3000);
			add.sendKeys(address);
			findlc.click();
			Thread.sleep(3000);
		     clk1.click();
	}
	
	public void Event81(String title,String descri,String address,String contact) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/12"); 
	       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/19");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			Select select=new Select(slrg);
			select.selectByIndex(1);
			Thread.sleep(3000);
			Select select1=new Select(slct);
			select1.selectByIndex(1);
			Thread.sleep(3000);
			add.sendKeys(address);
			findlc.click();
			Thread.sleep(3000);
			conem.sendKeys(contact);
		     clk1.click();
		   
	}
	
	public void Event91(String title,String descri,String address,String contact,String email) throws IOException, InterruptedException {
		ev.click();
		addev.click();
		driver.navigate().refresh();
		ttl.sendKeys(title);
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("em_start_date")).click();
		 Thread.sleep(7000);
		 ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_startdate').removeAttribute('readonly',0);");
		 WebElement fromDateBox= driver.findElement(By.cssSelector(".YB_startdate"));
		 fromDateBox.sendKeys("2018/12/05"); 
	       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/09");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			Select select=new Select(slrg);
			select.selectByIndex(1);
			Thread.sleep(3000);
			Select select1=new Select(slct);
			select1.selectByIndex(1);
			Thread.sleep(3000);
			add.sendKeys(address);
			findlc.click();
			Thread.sleep(3000);
			conem.sendKeys(contact);
			Thread.sleep(3000);
		    conemail.sendKeys(email);
		     Thread.sleep(3000);
		     clk1.click();
		     
	}
	
	public void expl() throws InterruptedException, FindFailed {
		driver.findElement(By.xpath("//p//a[@href='http://demo1.youthhub.com/profile/97364253']")).click();
		Thread.sleep(5000);
		String winHandleBefore = driver.getWindowHandle();
        Screen screen=new Screen();
		Pattern close =new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\close.png");
		screen.click(close);
		screen.wait(close,5000);
	}
	public void Explore(String tttt,String des,String topic,String conten) {
		ex.click();
		addex.click();
		tt.sendKeys(tttt);
		td.sendKeys(des);
	ttl2.sendKeys(topic);
	txt.click();
	cnt.sendKeys(conten);
	//clk1.click();
	
	}
	
	public void Event93(String title,String descri,String address,String contact,String email,String name ) throws InterruptedException, IOException {
		ev.click();
		addev.click();
		ttl.sendKeys(title);
	
		des.sendKeys(descri);
		logo.click();
		Runtime.getRuntime().exec("D:\\h1.exe");
		Thread.sleep(3000);
       driver.findElement(By.name("em_end_date")).click();
		   Thread.sleep(8000);
		   ((JavascriptExecutor)driver).executeScript("document.querySelector('.YB_enddate').removeAttribute('readonly',0);");
		   WebElement fromDateBox2= driver.findElement(By.cssSelector(".YB_enddate"));
		   fromDateBox2.sendKeys("2018/12/13");
		   driver.findElement(By.name("em_end_date")).click();
		   driver.findElement(By.name("em_start_time")).click();
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			js2.executeScript("document.querySelector('.YB_starttime').value='08:30 AM'");
			Thread.sleep(8000);
			driver.findElement(By.name("em_end_time")).click();
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			js3.executeScript("document.querySelector('.YB_endtime').value='08:30 PM'");
			Thread.sleep(8000);
			Select select=new Select(slrg);
			select.selectByIndex(1);
			Thread.sleep(3000);
			Select select1=new Select(slct);
			select1.selectByIndex(1);
			Thread.sleep(3000);
			add.sendKeys(address);
			findlc.click();
			Thread.sleep(3000);
			conem.sendKeys(contact);
			conemail.sendKeys(email);
			connam.sendKeys(name);
			clk1.click();
		    
	}
	public void Explore1(String tttt,String des,String topic,String conten) {
		ex.click();
		addex.click();
		tt.sendKeys(tttt);
		td.sendKeys(des);
	ttl2.sendKeys(topic);
	txt.click();
	cnt.sendKeys(conten);
	//clk1.click();
	
	}
	public void logout() throws InterruptedException, FindFailed {
	   
		ImagePath.setBundlePath("C:\\Users\\Tradezap\\Desktop\\Sikuli");
         Screen screen=new Screen();
		Pattern Profileicon =new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\proicon.png");
		Pattern logout=new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\logout.png");
	     screen.click(Profileicon);
	     screen.wait(Profileicon,5000);
	     Thread.sleep(8000);
	     screen.click(logout);
	     screen.wait(logout,8000);
	}
	public void refresh() throws  AWTException {
		Robot robot = new Robot();
		// press key Ctrl+Shift+r
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_R);
		// relase key Ctrl+Shift+r
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_R);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_R);
	}
	
	public void ylogout() throws FindFailed, InterruptedException {
		ImagePath.setBundlePath("C:\\Users\\Tradezap\\Desktop\\Sikuli");
        Screen screen=new Screen();
		Pattern Profileicon2 =new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\proicon2.png");
		Pattern logout2=new Pattern("C:\\Users\\Tradezap\\Desktop\\Sikuli\\logout2.png");
	     screen.click(Profileicon2);
	     screen.wait(Profileicon2,5000);
	     Thread.sleep(8000);
	     screen.click(logout2);
	     screen.wait(logout2,8000);
	}
	public void Explore1(String tttt)
{
		ex.click();
		addex.click();
		tt.sendKeys(tttt);

}
	public void Explore2(String name1,String special,String numbers) throws InterruptedException
	{
		menu.click();
		Thread.sleep(8000);
		explore.click();
		Thread.sleep(8000);
		nme.sendKeys(name1);
		Thread.sleep(8000);
		nme.clear();
		Thread.sleep(5000);
		nme.sendKeys(special);
		Thread.sleep(8000);
		nme.clear();
		Thread.sleep(5000);
		nme.sendKeys(numbers);
		nme.clear();
		Thread.sleep(5000);
	Select select = new Select(rating1);
	select.selectByIndex(2);
	Thread.sleep(3000);
	selecttag.click();
	Thread.sleep(8000);
    Actions actions = new Actions(driver);
    WebElement tag=driver.findElement(By.xpath("//input[contains(@class,'fstQueryInput fstQueryInputExpanded')]"));
   actions.moveToElement(tag);actions.click();actions.sendKeys("Videos");
   actions.build().perform();
   //WebElement tag1=driver.findElement(By.xpath("//input[contains(@class,'fstQueryInput fstQueryInputExpanded')]"));
  // actions.moveToElement(tag1);actions.click();actions.build().perform();
   Thread.sleep(9000);
   resulttag.click();
   Thread.sleep(8000);
   applyfilter.click();
   Thread.sleep(8000);
   Select select1 = new Select(rating1);
	select1.selectByIndex(3);
	Thread.sleep(3000);
	cleartag.click();
	Thread.sleep(8000);
	selecttag.click();
	Thread.sleep(8000);
   Actions action = new Actions(driver);
   WebElement tag1=driver.findElement(By.xpath("//input[contains(@class,'fstQueryInput fstQueryInputExpanded')]"));
   action.moveToElement(tag1);action.click();action.sendKeys("Text");
   action.build().perform();
   Thread.sleep(9000);
   resulttag.click();
   Thread.sleep(8000);
   applyfilter.click();
   Thread.sleep(8000);
   clickexplore.click();
    Thread.sleep(3000);
 //   addremexpl.click();
   // Thread.sleep(3000);
    ratingselect.click();
    Thread.sleep(3000);
    cleartag.click();
  	Thread.sleep(8000);
  	String parent=driver.getWindowHandle();
      Set<String>s1=driver.getWindowHandles();
  Iterator<String> I1= s1.iterator();
  while(I1.hasNext())
  {    String child_window=I1.next();
  if(!parent.equals(child_window))
  {driver.switchTo().window(child_window);
  System.out.println(driver.switchTo().window(child_window).getTitle());
  driver.close();
  }}
  driver.switchTo().window(parent); 
  myexplore.click();
  Thread.sleep(3000);
  sharedexplore.click();
  Thread.sleep(2000);
      
	}
	public void myevent(String titlename,String titlename1,String titlename2,String titlename3,String titlename4) throws InterruptedException {
		ev.click();
		Thread.sleep(5000);
		title.sendKeys(titlename);
		Thread.sleep(5000);
		title.clear();
		Thread.sleep(5000);
		title.sendKeys(titlename1);
		Thread.sleep(5000);
		title.clear();
		Thread.sleep(5000);
		title.sendKeys(titlename2);
		Thread.sleep(5000);
		title.clear();
		Thread.sleep(5000);
		title.sendKeys(titlename3);
		Thread.sleep(5000);
		title.clear();
		Thread.sleep(5000);
		title.sendKeys(titlename4);
		Thread.sleep(5000);
		eventclick.click();
	    Thread.sleep(9000);
	  //  edit.click();
	//    Thread.sleep(8000);
	}
public void editevent(String edittitle,String editeddes)throws InterruptedException {
	
	
  //  editoptionclick.click();
  //  Thread.sleep(8000);
    ttl.clear();
    ttl.sendKeys(edittitle);
    Thread.sleep(8000);
    des.clear();
    des.sendKeys(editeddes);
    Thread.sleep(8000);
   ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
    updateeditedevent.click();
    Thread.sleep(2000);
	
}
public void editevent1() throws InterruptedException {
	eventclick.click();
	edit.click();
   Thread.sleep(8000);
   editoptionclick.click();
   Thread.sleep(8000);
    ttl.clear();
    des.clear();
    ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
    updateeditedevent.click();
    Thread.sleep(2000);
   
}
public void editevent2(String edittitle ,String edittitle1,String editeddes1) throws IOException, InterruptedException {
	   ev.click();
	    Thread.sleep(5000);
	    title.sendKeys(edittitle);// title search
	    Thread.sleep(8000);
	    eventclick.click();//Game event click
	    Thread.sleep(8000);
	    edit.click();//edit dropdown option click
	    Thread.sleep(8000);
	    editoptionclick.click();//editoption click
	    Thread.sleep(8000);
	    ttl.clear();
	    ttl.sendKeys(edittitle1);//event title
	    Thread.sleep(8000);
	    des.sendKeys(editeddes1);//event description
	    Thread.sleep(8000);
	    logo.click();
	    Runtime.getRuntime().exec("D:\\h1.exe");
	    Thread.sleep(3000);
	    
}
public void editevent2_1(String contact,String email,String name) throws InterruptedException{
	conem.clear();
	conem.sendKeys(contact);
	conemail.clear();
	conemail.sendKeys(email);
	connam.clear();
	connam.sendKeys(name);
	updateeditedevent.click();
	Thread.sleep(2000);
}
public void event_test(String edittitle4) throws InterruptedException {
	ev.click();
	Thread.sleep(5000);
	title.sendKeys(edittitle4);
	Thread.sleep(8000);
	allevent.click();
	Thread.sleep(2000);
	title.clear();
    WebElement ele = driver.findElement(By.xpath("//label[text()='Auckland Region	']"));   ele.click();
    WebElement ele1 = driver.findElement(By.xpath("//label[text()='Waikato Region	']")); ele1.click(); 
    Thread.sleep(5000);
    WebElement ele2 = driver.findElement(By.xpath("//label[text()='Auckland City        ']")); ele2.click();
    WebElement ele3 = driver.findElement(By.xpath("//label[text()='Hamilton City        ']")); ele3.click();
    

 }
public void event_regionfilter() throws InterruptedException ,StaleElementReferenceException {
	String checkToBeSelected ="1";
	String checkToBeSelected1 ="3";
    List <WebElement> checklist =driver.findElements(By.name("region_id[]"));
    Thread.sleep(8000);
    System.out.println("Number of checkboxes present in webpage is:"+checklist.size());
    for (int i=0;i<checklist.size();i++)
    {
            if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected)) {
                    checklist.get(i).click();
                    }

            if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected1)) {
                    checklist.get(i).click();
                    }}}
public void event_cityfilter() throws InterruptedException {
	String checkToBeSelected2= "2";
    List <WebElement> checklist1 =driver.findElements(By.name("city_id[]"));
    Thread.sleep(8000);
    System.out.println("Number of checkboxes present in webpage is:"+checklist1.size());
    for (int i=0;i<checklist1.size();i++)
    {
            if(checklist1.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected2)) {
                    checklist1.get(i).click();
                    }}

}
public void event_regionfilter2() throws InterruptedException {
	
	String checkToBeSelected = "1";
    String checkToBeSelected2= "7";
    String checkToBeSelected3= "10";
     List <WebElement> checklist =driver.findElements(By.xpath("//*[@id=\"YB_event_list_filter\"]/div[3]/div[1]/div/div/div/label[1]/span"));
    Thread.sleep(8000);
    System.out.println("Number of checkboxes present in webpage is:"+checklist.size());
    for (int i=0;i<checklist.size();i++)
    {
            if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected)) {
                    checklist.get(i).click();
                    }
            if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected2)) {
                    checklist.get(i).click();
                    }
            if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkToBeSelected3)) {
                    checklist.get(i).click();
                   }
    }
    Thread.sleep(8000);
}
	
public void allevent(String titles) throws InterruptedException 
{
allevent.click();
Thread.sleep(2000);
title.sendKeys(titles);	
Thread.sleep(3000);
cl.click();
Thread.sleep(5000);

}
public void Refresh() {
	
	driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();	
	driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();
	driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();driver.navigate().refresh();
	}
}

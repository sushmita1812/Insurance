package baseclasses;

public class utilityclass {
	System.setProperty("webdriver.chrome.driver", Configrations.driverpath);
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(Configrations.appURL);
	
	driver.manage().window().maximize();
	
	 WebElement ss = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(ss).clickperform();
	

}

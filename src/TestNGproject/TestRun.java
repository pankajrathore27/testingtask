package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRun {
 public String baseUrl = "http://automationpractice.com/index.php";
 
	    String driverPath = "C:\\Users\\AjitKumarThakur\\Pictures\\MVAProject\\TestNGproject\\Driver\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() throws InterruptedException {
	       
	      System.out.println("launching Chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      driver.manage().window().maximize();
	      String expectedTitle = "My Store";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      
	      WebElement username = driver.findElement(By.xpath("//*[@class='login']"));
          username.click();
          //username.sendKeys("TestSelenium");
          JavascriptExecutor jse = (JavascriptExecutor)driver;
          jse.executeScript("window.scrollBy(0,150)");
       
          Thread.sleep(1000);
          WebElement username1=driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
  
          username1.sendKeys("pankajrathor27@gmail.com");
          
          Thread.sleep(3000);
          WebElement username2=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span/i"));
  
          username2.click();
          
          Thread.sleep(1000);
          WebElement username3=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
  
         username3.click();
         Thread.sleep(1000);
         WebElement username4=driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
 
        username4.click();
        Thread.sleep(1000);
        WebElement username5=driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));

       username5.click();
       
       Thread.sleep(1000);
       WebElement username6=driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_1\"]"));

      username6.click();
      Thread.sleep(1000);
      JavascriptExecutor jse1 = (JavascriptExecutor)driver;
      jse1.executeScript("window.scrollBy(0,750)");
	  }
	   @Test
public void createAccount() {
		   System.out.println("Create account");
		   
	   }
	
  }


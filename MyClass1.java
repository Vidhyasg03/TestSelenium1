package NewPackageVid;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass1 {
	
	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
				        
	     login();
	        
	    }
	        
	       public static void login()
	       {
	    	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		    	
		        String baseUrl = "http://demo.guru99.com/test/newtours/";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";

		        // launch Fire fox and direct it to the Base URL
		        driver.get(baseUrl);

		        // get the actual value of the title
		        actualTitle = driver.getTitle();

		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }

	       WebElement Name= driver.findElement(By.name("userName"));
	       WebElement P1 = driver.findElement(By.name("password"));
	       
	       Name.click();
	       Name.sendKeys("vidhyasg03@gmail.com");
	       System.out.println("entered the name");
	       
	       P1.click();
	       P1.sendKeys("test");
	       System.out.println("entered the password");
	       driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.MINUTES) ;
	      // WebDriverWait wait=new WebDriverWait(driver, 20);
	       System.out.println("waiting over"); 
	     //close Fire fox
	        driver.close();
	       
	       }
	       
	        
	        
	    

	}
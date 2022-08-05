package basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	     driver.get("http://demo.automationtesting.in/Register.html");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();	
        TakesScreenshot ts= (TakesScreenshot) driver;
        File f=(File) ts.getScreenshotAs(OutputType.FILE);
        
        File path=new File(".\\src\\test\\java\\basic\\QA.jpg");
       // FileUtils.copyFile(f, path);
        FileHandler.copy(f, path);


	}

}

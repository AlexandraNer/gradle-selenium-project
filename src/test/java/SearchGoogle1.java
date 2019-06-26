import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchGoogle1 {
    WebDriver driver;
@BeforeMethod
    public void setUp(){
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void googleSearchTest(){
driver.navigate().to("https://www.google.com/");
}


@AfterMethod
    public void tearDown(){
driver.quit();
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

class test {
    WebDriver driver;
    @Test
    public void setUp(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement button = driver.findElement(By.xpath("//button[text()= 'Add Element' "));
          for ( int i = 0 ; i <= 2 ; i++ ){
            button.click();
        }
        List<WebElement> webElements2 = driver.findElement(By.id("elements"));
        List<WebElement> webElements = driver.findElements(By.cssSelector("added"));

        System.out.println(webElements2.length -1);
        System.out.println(webElements);
    }
    @Test
    public void setUp2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
        WebElement webElement = driver.findElement(By.xpath("//*[containts(text(),'Asperian9' "));
        System.out.println(webElement);
    }
}
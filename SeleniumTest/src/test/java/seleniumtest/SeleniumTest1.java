package seleniumtest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//Selenium:testing tool used for automating web application
public class SeleniumTest1 {
    WebDriver driver;
    @BeforeEach
    public void getDriver(){
        //1.set up the browser driver
        //     chrome       webdriver.chrome.driver
        System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
        //2.use the test tool of selenium
        driver = new SafariDriver();   //ChromeDriver,FirefoxDriver
        //maximize window
        driver.manage().window().maximize();
    }

    @Test
    public void openOurWeb(){
        try{
            driver.get("http://localhost:8080/html");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#name")).sendKeys("Tom");
            driver.findElement(By.cssSelector("#age")).sendKeys("18");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#submit")).submit();
            Thread.sleep(2000);
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            driver.quit();
        }
    }

    @Test
    public void openGoogleTest(){
        try {//monitor area
            //3.open a certain page
            driver.get("https://www.google.com");
            //4.sleep for 3 second
            Thread.sleep(3000);//3 second
            //5.find the element in this page, set some value with it
            driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Taylor Swift");
            Thread.sleep(3000);//3 second
            //6.pres Eneter in this input box
            driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {//no matter your code works fine or not, finally area will be execute in the end
            driver.quit();
        }
    }

    @Test
    public void openBaiduTest(){

        try {//monitor area
            //3.open a certain page
            driver.get("https://www.baidu.com");
            //4.sleep for 3 second
            Thread.sleep(3000);//3 second
            //5.find the element in this page, set some value with it
            driver.findElement(By.cssSelector("#kw")).sendKeys("Taylor Swift");
            Thread.sleep(3000);//3 second
            //6.find the element in this page, which is a button,click it
            driver.findElement(By.cssSelector("#su")).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {//no matter your code works fine or not, finally area will be execute in the end
            driver.quit();
        }


    }


}











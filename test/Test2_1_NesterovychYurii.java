import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Test2_1_NesterovychYurii {
    @Test
    public void signIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/yrane/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/%22");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("yunest@protonmail.com");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Ironman2001@@@");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();
    }


    @Test
    public void forgotPassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/yrane/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/%22");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Forgot password?")).click();

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("yunest@protonmail.com");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.get("https://mail.protonmail.com/u/0/inbox");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.id("username")).click();

        driver.findElement(By.id("username")).clear();

        driver.findElement(By.id("username")).sendKeys("yunest@protonmail.com");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Ironman2001@@@");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/main/div/div/div[2]")).click();

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Restore")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://ita-social-projects.github.io/GreenCityClient/#/auth/restore?token=MTYyNzE1NjYzODM3MC40YmEyMzY3MC1kYjhmLTRmMWEtYmU5MS05NjQ3MTYyYTZiZWU%3D&user_id=9779");
        driver3.manage().window().maximize();

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver3.findElement(By.name("form-control password")).click();
        driver3.findElement(By.name("form-control password")).clear();
        driver3.findElement(By.name("form-control password")).sendKeys("Ironman2001@@@");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver3.findElement(By.name("form-control password-confirm")).click();
        driver3.findElement(By.name("form-control password-confirm")).clear();
        driver3.findElement(By.name("form-control password-confirm")).sendKeys("Ironman2001@@@");
        driver3.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();
    }

    @Test
    public void signUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:/Users/yrane/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://temp-mail.io/uk");
        Thread.sleep(10000);
        driver2.findElement(By.id("email")).click();
        String data = (String) Toolkit.getDefaultToolkit()
                .getSystemClipboard().getData(DataFlavor.stringFlavor);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.xpath("//li[2]/div/span")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(data);

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("username");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Blablapassword111!");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).clear();
        driver.findElement(By.id("repeatPassword")).sendKeys("Blablapassword111!");

        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
        driver2.findElement(By.cssSelector("#__layout > div > div.cookie-warning.active > button > svg")).click();
        driver2.findElement(By.xpath("/html/body/div/div/div/aside/div[1]/div[2]/div/div/ul/li[1]")).click();
        Thread.sleep(4000);
        driver2.findElement(By.linkText("Verify Email")).click();
        driver2.quit();
    }

}


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_2_2 {

    @Test
    public void SignUp() {

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.cssSelector("[class=\"header_sign-up-btn secondary-global-button\"]")).click();

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("fekihas691@ncstorms.com");

        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("fekihas");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Qq12345!");

        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).clear();
        driver.findElement(By.id("repeatPassword")).sendKeys("Qq12345!");

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        driver.quit();
    }

    @Test
    public void SignIn () {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.cssSelector("[class=\"header_sign-in-link tertiary-global-button\"]")).click();

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("fekihas691@ncstorms.com");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Qq12345!");

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        driver.quit();
    }

    @Test
    public void ForgotPassword() {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.findElement(By.cssSelector("[class=\"header_sign-in-link tertiary-global-button\"]")).click();

        driver.findElement(By.cssSelector("[class=\"forgot-password\"]")).click();

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("fekihas691@ncstorms.com");

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        driver.quit();
    }
}

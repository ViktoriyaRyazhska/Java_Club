import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.util.concurrent.TimeUnit;

public class Test2_2_NesterovychYurii {
    static final int pause = 2000;
    static final int bigPause = 10000;
    @Test
    public void signIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/%22");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(pause);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("yunest@protonmail.com");

        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Ironman2001@@@");

        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();
    }

    @Test
    public void signInInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/%22");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(pause);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //empty email
        driver.findElement(By.id("email")).click();

        Thread.sleep(pause);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("password")).click();
        String ExpectedEmptyEmail = new String("Email is required");
        String ActualEmptyEmail = driver.findElement(By.cssSelector("#email-err-msg div")).getText();
        Assert.assertEquals(ExpectedEmptyEmail,ActualEmptyEmail);

        Thread.sleep(pause);

        //empty password
        driver.findElement(By.id("email")).click();

        Thread.sleep(pause);

        String ExpectedEmptyPassword = new String("Password is required");
        String ActualEmptyPassword = driver.findElement(By.cssSelector("#pass-err-msg div")).getText();
        Assert.assertEquals(ExpectedEmptyPassword,ActualEmptyPassword);

        // Email has incorrect data
        driver.findElement(By.id("email")).sendKeys("email");
        driver.findElement(By.id("password")).click();
        String expectedEmail = new String("Please check that your e-mail address is indicated correctly");

        Thread.sleep(pause);

        String actualEmail = driver.findElement(By.cssSelector("#email-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedEmail,actualEmail);

        // Password has long <8 characters
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("passwor");
        driver.findElement(By.id("email")).click();
        String ExpectedLongOfPassword = new String("Password must be at least 8 characters long");
        String ActualLongOfPassword = driver.findElement(By.cssSelector("#pass-err-msg > app-error")).getText();

        Thread.sleep(pause);

        Assert.assertEquals(ExpectedLongOfPassword,ActualLongOfPassword);

        // Bad email or password
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("badEmail@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("badpassword");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String badEmailOrPasswordExpected = new String("Bad email or password");
        String badEmailOrPasswordActual = driver.findElement(By.cssSelector("#mat-dialog-0 > app-auth-modal > div > div > div.right-side > div > app-sign-in > form > div.alert-general-error.ng-star-inserted")).getText();
        Thread.sleep(pause);
        Assert.assertEquals(badEmailOrPasswordExpected,badEmailOrPasswordActual);

        Thread.sleep(pause);
        driver.close();
    }
    @Test
    public void forgotPassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
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

        Thread.sleep(12000);
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
    public void forgoPasswordInValidData() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", ".idea/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");


        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(pause);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(pause);

        // Email is empty
        driver.findElement(By.id("email")).click();

        Thread.sleep(pause);

        driver.findElement(By.cssSelector(".or-use-google")).click();

        Thread.sleep(pause);

        String expectedEmailEmpty = new String("Email is required");
        String actualEmailEmpty = driver.findElement(By.cssSelector("app-error > div")).getText();
        Thread.sleep(pause);
        Assert.assertEquals(expectedEmailEmpty,actualEmailEmpty);

        // Email is incorrect
        driver.findElement(By.id("email")).sendKeys("test");

        Thread.sleep(pause);

        driver.findElement(By.cssSelector(".or-use-google")).click();

        Thread.sleep(pause);

        String expectedEmailInc = new String("Please check that your e-mail address is indicated correctly");
        String actualEmailInc = driver.findElement(By.cssSelector("app-error > div")).getText();

        Thread.sleep(pause);

        Assert.assertEquals(expectedEmailInc,actualEmailInc);


        // The user does not exist by this email
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("bad@test.ua");

        Thread.sleep(pause);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(pause);

        String expectedEmailExist = new String("The user does not exist by this email : bad@test.ua");
        String actualEmailExist = driver.findElement(By.cssSelector(".validation-email-error")).getText();

        Thread.sleep(pause);

        Assert.assertEquals(expectedEmailExist,actualEmailExist);


        Thread.sleep(bigPause);
        driver.close();
    }
    @Test
    public void signUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
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
    @Test
    public void signUpInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(pause);
        driver.findElement(By.xpath("//li[2]/div/span")).click();

        Thread.sleep(pause);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("firstName")).click();

        Thread.sleep(pause);


        // Email is empty
        String expectedEmailEmpty = new String("Email is required");
        String actualEmailEmpty = driver.findElement(By.cssSelector("app-error > div")).getText();

        Thread.sleep(pause);

        Assert.assertEquals(expectedEmailEmpty,actualEmailEmpty);

        // Email is incorrect
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("bad");
        driver.findElement(By.id("firstName")).click();
        String expectedIncorectEmail = new String("Please check that your e-mail address is indicated correctly");
        String actualIncorectEmail = driver.findElement(By.xpath("//div[@id='email-err-msg']/app-error/div")).getText();
        Assert.assertEquals(expectedIncorectEmail,actualIncorectEmail);
        Thread.sleep(pause);

        // First name is empty
        driver.findElement(By.id("firstName")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String expectedFirstNameEmpty = new String("User name is required");
        String actualFirstNameEmpty = driver.findElement(By.cssSelector("#firstname-err-msg > app-error")).getText();
        Assert.assertEquals(expectedFirstNameEmpty,actualFirstNameEmpty);
        Thread.sleep(pause);

        // First name is short
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("email")).click();
        String expectedFirstNameShort = new String("The name must contain 6-30 characters and can contain " +
                "letters(a-z), numbers(0-9) and a dot(.), dot at the start, " +
                "at the end and consecutive dot is forbidden");
        String actualFirstNameShort = driver.findElement(By.cssSelector("#firstname-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedFirstNameShort,actualFirstNameShort);
        Thread.sleep(pause);

        // First name has invalid characters
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys("Test!~$%");
        driver.findElement(By.id("email")).click();
        String expectedFirstNameInvChar = new String("The name must contain 6-30 characters and can contain " +
                "letters(a-z), numbers(0-9) and a dot(.), dot at the start, " +
                "at the end and consecutive dot is forbidden");
        String actualFirstNameInvChar = driver.findElement(By.cssSelector("#firstname-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedFirstNameInvChar,actualFirstNameInvChar);
        Thread.sleep(pause);

        //Password is empty
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("email")).click();
        String expectedPasswordEmpty = new String("Password is required");
        String actualPasswordEmpty = driver.findElement(By.cssSelector("#password-err-msg")).getText();
        Assert.assertEquals(expectedPasswordEmpty,actualPasswordEmpty);
        Thread.sleep(pause);

        // Password has long <8 characters
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("bad");
        driver.findElement(By.id("email")).click();
        String expectedPasswordLong = new String("Password must be at least 8 characters long");
        String actualPasswordLong = driver.findElement(By.cssSelector("#password-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedPasswordLong,actualPasswordLong);
        Thread.sleep(pause);

        // Password has invalid character
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("zxcadasda");
        driver.findElement(By.id("email")).click();
        String expectedPasswordInvChar = new String("Password has contain at least one character of " +
                "Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), " +
                "Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)");
        String actualPasswordInvChar = driver.findElement(By.cssSelector("#password-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedPasswordInvChar,actualPasswordInvChar);
        Thread.sleep(pause);

        //Confirm password is empty
        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String expectedConfPasswordEmpty = new String("Password is required");
        String actualConfPasswordEmpty = driver.findElement(By.cssSelector("#confirm-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedConfPasswordEmpty,actualConfPasswordEmpty);
        Thread.sleep(pause);

        // Confirm password doesn't match to password
        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).sendKeys("badpassword");
        driver.findElement(By.id("email")).click();
        String expectedConfirmPasswordMatch = new String("Passwords do not match");
        String actualConfirmPasswordMatch = driver.findElement(By.cssSelector("#confirm-err-msg > app-error > div")).getText();
        Assert.assertEquals(expectedConfirmPasswordMatch,actualConfirmPasswordMatch);
        Thread.sleep(bigPause);
        driver.close();
    }
}

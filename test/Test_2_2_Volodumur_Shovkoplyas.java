import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Test_2_2_Volodumur_Shovkoplyas {
    static final int THREAD_LONG_DELAY = 15000;
    static final int THREAD_DELAY = 3500;
    static final int DELAY = 15;
    private String staticEmail = new String("TesterVolodya@protonmail.com");
    private String passwordEmail = new String("!Test1()!");


    @Test
    public void registrationValidData() throws InterruptedException, IOException, UnsupportedFlavorException {
        System.setProperty("webdriver.chrome.driver",".idea/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://temp-mail.io/uk");

        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.id("email")).click();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String email = (String) clipboard.getData(DataFlavor.stringFlavor);

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        String userName = email.substring(0,email.indexOf('@'));

        Thread.sleep(THREAD_DELAY);
        driver1.findElement(By.cssSelector(".header_sign-up-btn")).click();
        Thread.sleep(THREAD_DELAY);

        driver1.findElement(By.id("email")).sendKeys(email);
        driver1.findElement(By.id("firstName")).sendKeys(userName);
        driver1.findElement(By.id("password")).sendKeys(passwordEmail);
        driver1.findElement(By.id("repeatPassword")).sendKeys(passwordEmail);
        Thread.sleep(THREAD_DELAY);
        driver1.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(THREAD_DELAY);

        driver.findElement(By.cssSelector("#__layout > div > div.cookie-warning.active > button > svg")).click();
        driver.manage().timeouts().implicitlyWait(360,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".message__subject")).click();
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.linkText("Verify Email")).click();
        Thread.sleep(THREAD_DELAY);

        driver1.get("https://ita-social-projects.github.io/GreenCityClient/#/");
        Thread.sleep(THREAD_DELAY);
        driver1.findElement(By.linkText("Sign in")).click();
        Thread.sleep(THREAD_DELAY);
        driver1.findElement(By.id("email")).sendKeys(email);
        driver1.findElement(By.id("password")).sendKeys(passwordEmail);

        Thread.sleep(THREAD_DELAY);
        driver1.findElement(By.xpath("//button[@type='submit']")).click();


        Thread.sleep(THREAD_LONG_DELAY);

        driver.quit();
        driver1.quit();
    }
    @Test
    public void signInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(staticEmail);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(passwordEmail);

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(THREAD_LONG_DELAY);
        driver.close();

    }
    @Test
    public void forgotPassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(staticEmail);

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Open mail and change password
        driver.get("https://account.protonmail.com/login");
        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(staticEmail);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(passwordEmail);


        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/div[2]/form/button")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div/main/div/div/div[2]")).click();

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Restore')]")).click();

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[4]/dialog/form/footer/button[2]")).click();
        Thread.sleep(THREAD_DELAY);

        driver.getWindowHandle();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        //Change tab

        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));


        driver.findElement(By.xpath("//input[@name='form-control password']")).click();
        driver.findElement(By.xpath("//input[@name='form-control password']")).sendKeys(passwordEmail);

        Thread.sleep(THREAD_DELAY);

        driver.findElement(By.xpath("//input[@name='form-control password-confirm']")).click();
        driver.findElement(By.xpath("//input[@name='form-control password-confirm']")).sendKeys(passwordEmail);

        Thread.sleep(THREAD_DELAY);

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        Thread.sleep(THREAD_LONG_DELAY);
        driver.close();


    }
    @Test
    public void signInEmailPasswordInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.manage().timeouts().implicitlyWait(DELAY,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(THREAD_DELAY);
        // Email is empty
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("password")).click();
        String emailEmptyExpected = new String("Email is required");
        Thread.sleep(THREAD_DELAY);
        String emailEmptyActual = driver.findElement(By.cssSelector("#email-err-msg > app-error > div")).getText();
        Assert.assertEquals(emailEmptyExpected,emailEmptyActual);

        // Email has incorrect data
        driver.findElement(By.id("email")).sendKeys("Tester");
        driver.findElement(By.id("password")).click();
        String emailExpected = new String("Please check that your e-mail address is indicated correctly");
        Thread.sleep(THREAD_DELAY);
        String emailActual = driver.findElement(By.cssSelector("#email-err-msg > app-error > div")).getText();
        Assert.assertEquals(emailExpected,emailActual);

        //Password is empty
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String PasswordEmptyExpected = new String("Password is required");
        Thread.sleep(THREAD_DELAY);
        String PasswordEmptyActual = driver.findElement(By.cssSelector("#pass-err-msg > app-error")).getText();
        Assert.assertEquals(PasswordEmptyExpected,PasswordEmptyActual);

        // Password has long <8 characters (Invalid data)
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("5544");
        driver.findElement(By.id("email")).click();
        String passwordLongEmailExpected = new String("Password must be at least 8 characters long");
        String passwordLongEmailActual = driver.findElement(By.cssSelector("#pass-err-msg > app-error")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(passwordLongEmailExpected,passwordLongEmailActual);

        // Bad email or password
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("Tester@bad");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("badpassword");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String badEmailOrPasswordExpected = new String("Bad email or password");
        String badEmailOrPasswordActual = driver.findElement(By.cssSelector("#mat-dialog-0 > app-auth-modal > div > div > div.right-side > div > app-sign-in > form > div.alert-general-error.ng-star-inserted")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(badEmailOrPasswordExpected,badEmailOrPasswordActual);

        Thread.sleep(THREAD_DELAY);
        driver.close();

    }
    @Test
    public void registrationInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.cssSelector(".header_sign-up-btn")).click();
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("firstName")).click();
        Thread.sleep(THREAD_DELAY);


        // Email is empty
        String emailEmptyExpected = new String("Email is required");
        String emailEmptyActual = driver.findElement(By.cssSelector("app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(emailEmptyExpected,emailEmptyActual);

        // Email is incorrect
        driver.findElement(By.id("email")).sendKeys("Test");
        driver.findElement(By.id("firstName")).click();
        String emailExpected = new String("Please check that your e-mail address is indicated correctly");
        Thread.sleep(THREAD_DELAY);
        String emailActual = driver.findElement(By.xpath("//div[@id='email-err-msg']/app-error/div")).getText();
        Assert.assertEquals(emailExpected,emailActual);

        // First name is empty
        driver.findElement(By.id("firstName")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String firstNameEmptyExpected = new String("User name is required");
        Thread.sleep(THREAD_DELAY);
        String firstNameEmptyActual = driver.findElement(By.cssSelector("#firstname-err-msg > app-error")).getText();
        Assert.assertEquals(firstNameEmptyExpected,firstNameEmptyActual);

        // First name is short
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("email")).click();
        String firstNameShortExpected = new String("The name must contain 6-30 characters and can contain " +
                "letters(a-z), numbers(0-9) and a dot(.), dot at the start, " +
                "at the end and consecutive dot is forbidden");
        Thread.sleep(THREAD_DELAY);
        String firstNameShortActual = driver.findElement(By.cssSelector("#firstname-err-msg > app-error > div")).getText();
        Assert.assertEquals(firstNameShortExpected,firstNameShortActual);

        // First name has invalid characters
        driver.findElement(By.id("firstName")).sendKeys("Test!~$%");
        driver.findElement(By.id("email")).click();
        String firstNameInvCharExpected = new String("The name must contain 6-30 characters and can contain " +
                "letters(a-z), numbers(0-9) and a dot(.), dot at the start, " +
                "at the end and consecutive dot is forbidden");
        Thread.sleep(THREAD_DELAY);
        String firstNameInvCharActual = driver.findElement(By.cssSelector("#firstname-err-msg > app-error > div")).getText();
        Assert.assertEquals(firstNameInvCharExpected,firstNameInvCharActual);

        //Password is empty
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String PasswordEmptyExpected = new String("Password is required");
        Thread.sleep(THREAD_DELAY);
        String PasswordEmptyActual = driver.findElement(By.cssSelector("#password-err-msg")).getText();
        Assert.assertEquals(PasswordEmptyExpected,PasswordEmptyActual);

        // Password has long <8 characters
        driver.findElement(By.id("password")).sendKeys("aba");
        driver.findElement(By.id("email")).click();
        String passwordLongExpected = new String("Password must be at least 8 characters long");
        String passwordLongActual = driver.findElement(By.cssSelector("#password-err-msg > app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(passwordLongExpected,passwordLongActual);

        // Password has invalid character
        driver.findElement(By.id("password")).sendKeys("zxcadasda");
        driver.findElement(By.id("email")).click();
        String passwordInvCharExpected = new String("Password has contain at least one character of " +
                "Uppercase letter (A-Z), Lowercase letter (a-z), Digit (0-9), " +
                "Special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)");
        String passwordInvCharActual = driver.findElement(By.cssSelector("#password-err-msg > app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(passwordInvCharExpected,passwordInvCharActual);

        //Confirm password is empty
        driver.findElement(By.id("repeatPassword")).sendKeys("");
        driver.findElement(By.id("email")).click();
        String ConfPasswordEmptyExpected = new String("Password is required");
        String ConfPasswordEmptyActual = driver.findElement(By.cssSelector("#confirm-err-msg > app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(ConfPasswordEmptyExpected,ConfPasswordEmptyActual);

        // Confirm password doesn't match to password
        driver.findElement(By.id("repeatPassword")).sendKeys("test");
        driver.findElement(By.id("email")).click();
        String confPasswordMatchExpected = new String("Passwords do not match");
        String confPasswordMatchActual = driver.findElement(By.cssSelector("#confirm-err-msg > app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(confPasswordMatchExpected,confPasswordMatchActual);

        Thread.sleep(THREAD_LONG_DELAY);
        driver.quit();
    }
    @Test
    public void forgotPasswordInValidData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Vov/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("#mat-dialog-0 > app-auth-modal > div > div > div.right-side > div" +
                " > app-sign-in > form > div.forgot-wrapper > a")).click();
        Thread.sleep(THREAD_DELAY);

        // Email is empty
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("");
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-auth-modal/div/div/div[2]/div/app-restore-password/div")).click();
        Thread.sleep(THREAD_DELAY);
        String emailEmptyExpected = new String("Email is required");
        String emailEmptyActual = driver.findElement(By.cssSelector("app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(emailEmptyExpected,emailEmptyActual);

        // Email is incorrect
        driver.findElement(By.id("email")).sendKeys("test");
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']/app-auth-modal/div/div/div[2]/div/app-restore-password/div")).click();
        Thread.sleep(THREAD_DELAY);
        String emailIncExpected = new String("Please check that your e-mail address is indicated correctly");
        String emailIncActual = driver.findElement(By.cssSelector("app-error > div")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(emailIncExpected,emailIncActual);


        // The user does not exist by this email
        driver.findElement(By.id("email")).clear();
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.id("email")).sendKeys("test@test.ua");
        Thread.sleep(THREAD_DELAY);
        driver.findElement(By.cssSelector(".send-btn")).click();
        Thread.sleep(THREAD_DELAY);
        String emailExistExpected = new String("The user does not exist by this email : test@test.ua");
        String emailExistActual = driver.findElement(By.cssSelector(".validation-email-error")).getText();
        Thread.sleep(THREAD_DELAY);
        Assert.assertEquals(emailExistExpected,emailExistActual);


        Thread.sleep(THREAD_LONG_DELAY);
        driver.close();
    }
}


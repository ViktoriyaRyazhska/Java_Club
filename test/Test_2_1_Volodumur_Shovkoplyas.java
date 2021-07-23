import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2_1_Volodumur_Shovkoplyas {
    int delay = 2000;
    String emailTest = new String("MyEmail@softserve.com");
    String passwordTest = new String("!Qwerty123456()!");
    String firstNameTest = new String("Volodymyr");

    @Test
    public void signIn()throws Exception{

        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(delay);

        driver.findElement(By.linkText("Sign in")).click();


        Thread.sleep(delay);

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(emailTest);

        Thread.sleep(delay);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(passwordTest);

        Thread.sleep(delay);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(delay);
        driver.quit();
    }

    @Test
    public void forgotPassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(delay);
        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(delay);
        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();

        Thread.sleep(delay);
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(emailTest);

        Thread.sleep(delay);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void SignUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(delay);
        driver.findElement(By.cssSelector(".header_sign-up-btn")).click();

        Thread.sleep(delay);
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(emailTest);

        Thread.sleep(delay);
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstNameTest);

        Thread.sleep(delay);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(passwordTest);

        Thread.sleep(delay);
        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).sendKeys(passwordTest);

        Thread.sleep(delay);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void SignUpFromSighIn() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Vov/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ita-social-projects.github.io/GreenCityClient/#/");

        Thread.sleep(delay);
        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(delay);
        driver.findElement(By.cssSelector(".sign-up-link")).click();

        Thread.sleep(delay);
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(emailTest);

        Thread.sleep(delay);
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstNameTest);

        Thread.sleep(delay);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(passwordTest);

        Thread.sleep(delay);
        driver.findElement(By.id("repeatPassword")).click();
        driver.findElement(By.id("repeatPassword")).sendKeys(passwordTest);

        Thread.sleep(delay);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}

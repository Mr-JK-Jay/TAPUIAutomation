
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;


public class ReportDownloader {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Chromedriver Path Set in below line using setproperty
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jselvaraj\\Desktop\\Automation\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);

        try {

            Thread.sleep(10000);
            driver.get("https://20.219.255.221:8443/onPOINT/projects");
            driver.manage().window().maximize();
            Thread.sleep(10000);
            driver.findElement(By.name("usernameField")).sendKeys("administrator@tekvizion.com");
            driver.findElement(By.name("passwordField")).sendKeys("admin123");
            driver.findElement(By.className("rsdLoginButton")).click();
            Thread.sleep(15000);
            driver.navigate().refresh();
            Thread.sleep(15000);


            driver.findElement(By.xpath("/html/body/app-root/div/div/div/ng-sidebar-container/div/div/section/project/div/div[4]/div/data-table/div/div/div/table/tbody/tr[1]/td[1]")).click();


            Thread.sleep(15000);
            ///html/body/app-root/div/div/div/ng-sidebar-container/div/div/section/project/div/div[4]/div/data-table/div/div/div/table/tbody/tr[8]/td[2]
            //driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();

            driver.findElement(By.xpath("//button[@id=\"downloadReport\"]\n")).click();
            //Thread.sleep(15000);
            driver.findElement(By.xpath("//input[@id=\"runOnceField\" and @type=\"radio\"]\n")).click();
            //Thread.sleep(15000);
            driver.findElement(By.xpath("//input[@id=\"fromDateReport\"]\n")).click();
            //Thread.sleep(15000);
            driver.findElement(By.xpath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[4]/td[6]")).click();
            //Thread.sleep(15000);
            driver.findElement(By.xpath("//input[@id=\"toDateReport\"]\n")).click();
            //Thread.sleep(15000);
            driver.findElement(By.xpath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[4]/td[6]")).click();
            Thread.sleep(15000);
            driver.findElement(By.xpath("//button[@id=\"runProjectRunBtn\"]\n")).click();
            Thread.sleep(15000);



        } finally {

            driver.quit();
        }
    }
}

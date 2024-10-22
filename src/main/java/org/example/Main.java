package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String driverPath = "D:\\chromedriver\\chromedriver.exe";
        System.out.println("launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver.get("https://lassanaflora.merchant.test.psp.ebeyondsonline.com/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("chalani.ebeyonds@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();


    }
}
package com.sdet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // Set ChromeDriver path
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://example.com");

        // Locate username and password fields and enter credentials
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}


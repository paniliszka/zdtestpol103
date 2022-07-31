package com.sda.zdtestpol103;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.crypto.spec.OAEPParameterSpec;

public class WebDriverManager {

    public static RemoteWebDriver DRIVER;

    public static void startDriver() {
switch (getBrowserName()){
    case "chrome":
        DRIVER = new ChromeDriver();
        break;
    case "firefox":
        DRIVER = new FirefoxDriver();
        break;
    case "safari":
        DRIVER = new SafariDriver();
        break;
    default:
        throw new IllegalStateException("UNSUPPORTER BROWSER");

}
DRIVER.manage().window().maximize();
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }

    public static String getBrowserName(){
        return System.getProperty("browserName", "chrome");
    }
}

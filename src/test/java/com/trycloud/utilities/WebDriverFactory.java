package com.trycloud.utilities;

// Accepts string argument: browser type ---> will determine what browser opens
//      if --> "chrome" opens chrome browser
//      if --> "firefox" opens firefox browser
//      if --? "opera" opens opera browser
//      if --> "edge" opens edge browser
//  return type: WebDriver
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
public class WebDriverFactory {

}

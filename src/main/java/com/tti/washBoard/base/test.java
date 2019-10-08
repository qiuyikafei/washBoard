package com.tti.washBoard.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver",
             "E:/driver.exe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     driver.get("http://www.baidu.com");
     Thread.sleep(5000);    //休眠5秒
     driver.manage().window().maximize();             //浏览器最大化
     driver.navigate().to("http://www.baidu.com"); //页面跳转
     driver.navigate().refresh();     //刷新页面
     driver.navigate().back();        //浏览器后退
     driver.navigate().forward();    //浏览器前进
     driver.quit(); //浏览器退出
     //System.out.println( "Hello World!" );
    }
}  


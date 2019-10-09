package com.tti.washBoard.page;

import org.openqa.selenium.By;

/**
 * @description 首页面元素定位声明
 * */
public class HomePage {
    
    /**用户名显示区域*/
    public static final By HP_TEXT_USERNAME= By.xpath("//div[@class='user-panel']//a"); 
    /**头部washboard图片*/
    public static final By HP_BUTTON_FLIGHTS = By.xpath("//div[@class='col-md-4']//img");
    /**底部kiosoft图片*/
    public static final By HP_BUTTON_ITINERARY = By.xpath("//div[@id='footer']//img");
    /**首页完整文本*/
    public static final By HP_TEXT_HOME= By.className("page-header");  
    
}

package com.tti.washBoard.page;

import org.openqa.selenium.By;
/**
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
    /**用户名输入框*/
    public static final By LP_INPUT_USERNAME = By.name("login");
    
    /**密码输入框*/
    public static final By LP_INPUT_PASSWORD = By.name("password");
    
    /**登录按钮*/
    public static final By LP_BUTTON_LOGIN = By.id("btn-submit");
    
    /**登录错误信息*/
    public static final By LP_TEXT_ERROR= By.xpath("//div[@class='message merged alert alert-danger']");
    
}

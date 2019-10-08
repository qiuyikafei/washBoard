package com.tti.washBoard.testCases.login;

import org.testng.annotations.Test;

import com.tti.washBoard.base.BaseParpare;
import com.tti.washBoard.pageHelper.HomePageHelper;
import com.tti.washBoard.pageHelper.LoginPageHelper;

/**
 * 
* @Description: 登录之后验证用户名是不是正确的
* @author: cynthia
* @date: 2019-10-08
 */
public class LoginPage_001_LoginSuccessFunction_Test extends BaseParpare{
  @Test
  public void loginSuccessFunction() {
      //等待登录页面加载
      LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
      // 输入登录信息
      LoginPageHelper.typeLoginInfo(seleniumUtil,"admin@wb02.com", "123456");
      //等待首页元素显示出来
      HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
      //检查用户名是不是期望的"jojo"
      HomePageHelper.checkUserName(seleniumUtil, timeOut, "admin");
  }
}

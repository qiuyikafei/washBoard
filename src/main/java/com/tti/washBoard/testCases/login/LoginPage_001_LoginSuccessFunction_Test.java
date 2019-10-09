package com.tti.washBoard.testCases.login;

import java.util.Map;

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
  @Test(dataProvider="testData")
  public void loginSuccessFunction(Map<String, String> data) {
      //等待登录页面加载
      LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
      // 输入登录信息
      LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("userName"), data.get("passWord"));
      //等待首页元素显示出来
      HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
      //检查用户名是不是期望的"admin"
      HomePageHelper.checkUserName(seleniumUtil, timeOut, data.get("loginName"));
  }
}

package cn.com.spring.service.impl;

import cn.com.spring.service.ILoginService;

public class LoginServiceImpl implements ILoginService {

  public boolean login(String userName, String password) {
    System.out.println("login:" + userName + "," + password);
    return true;
  }

}

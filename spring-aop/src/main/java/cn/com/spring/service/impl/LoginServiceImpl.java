package cn.com.spring.service.impl;

import cn.com.spring.service.ILoginService;

public class LoginServiceImpl implements ILoginService {

  public boolean login(String userName, String password) throws Exception {
    System.out.println("login:" + userName + "," + password);
    if ("swell".equals(userName)) {
      System.out.println("throw new exception --------------------");
      throw new Exception("exception test");
    }
    return true;
  }

}

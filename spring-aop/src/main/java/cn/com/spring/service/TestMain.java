package cn.com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

  public static void testSpringAOP() {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    ILoginService loginService = (ILoginService) ctx.getBean("loginService");
    loginService.login("zhangsan", "12344");
  }

  public static void main(String[] args) {

    testSpringAOP();

  }

}

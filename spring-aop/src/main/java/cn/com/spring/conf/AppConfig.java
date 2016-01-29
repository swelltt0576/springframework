package cn.com.spring.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import cn.com.spring.service.ILogService;
import cn.com.spring.service.ILoginService;
import cn.com.spring.service.impl.LogServiceImpl;
import cn.com.spring.service.impl.LoginServiceImpl;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"cn.com.spring.aop"})
public class AppConfig {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
    ILoginService login = context.getBean(ILoginService.class);
    try {
      login.login("swell", "password");
    } catch (Exception e) {
      System.out.println("main exit -----------------" + e.getMessage());
      e.printStackTrace();
    }
    context.close();
  }

  @Bean
  public ILoginService loginService() {
    return new LoginServiceImpl();
  }

  @Bean
  public ILogService logService() {
    return new LogServiceImpl();
  }


}

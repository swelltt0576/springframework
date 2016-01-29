package cn.com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * ServiceAop aop示例
 *
 * @author wxu
 * @class cn.com.spring.aop.ServiceAop
 * @date 2016年1月29日 上午10:03:42
 * @since 1.0
 */
@Component
@Aspect
public class ServiceAop {



  @Before("execution(* cn.com.spring.service.ILoginService.*(..))")
  public void before() {
    System.out.println("before trigger-------------");
  }

  @After("execution(* cn.com.spring.service.impl.LoginServiceImpl.*(..))")
  public void after() {
    System.out.println("after trigger----------------");
  }

//  @Around("execution(* cn.com.spring.service.ILoginService.login(..))")
  public boolean around(JoinPoint joinPoint) {
    try {
      System.out.println("around trigger before------------");
      Object result = ((ProceedingJoinPoint) joinPoint).proceed();
      System.out.println("around trigger after------------");
      return (boolean) result;
    } catch (Throwable e) {
      e.printStackTrace();
    }

    return true;
  }

  @AfterThrowing(pointcut = "execution(* cn.com.spring.service.ILoginService.login(..))", throwing = "ex")
  public void afterThrow(JoinPoint joinPoint, Exception ex) {
    System.out.println("afterThrow trigger------------");
  }
}

package cn.com.spring.service.impl;

import org.aspectj.lang.JoinPoint;

import cn.com.spring.service.ILogService;

public class LogServiceImpl implements ILogService {

  @Override
  public void log() {
    System.out.println("*************Log*******************");
  }

  // 有参无返回值的方法
  public void logArg(JoinPoint point) {
    
    System.out.println("current thread name:"+Thread.currentThread().getName());
    // 此方法返回的是一个数组，数组中包括request以及ActionCofig等类对象
    Object[] args = point.getArgs();
    System.out.println("目标参数列表：");
    if (args != null) {

      for (Object obj : args) {

        System.out.println(obj + ",");

      }

      System.out.println();

    }

  }

  // 有参并有返回值的方法

  public void logArgAndReturn(JoinPoint point, Object returnObj) {

    // 此方法返回的是一个数组，数组中包括request以及ActionCofig等类对象
    System.out.println("current thread name:"+Thread.currentThread().getName());
    Object[] args = point.getArgs();

    System.out.println("目标参数列表：");

    if (args != null) {

      for (Object obj : args) {

        System.out.println(obj + ",");

      }

      System.out.println();

      System.out.println("执行结果是：" + returnObj);

    }

  }

}

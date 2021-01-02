package com.example.springbootaop.aspet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.example.springbootaop.service.UserService.* (..))")
    public void pointcut1() {
    }

    @Before(value = "pointcut1()")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法还是执行...");
    }

    @After(value = "pointcut1()")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }

    @AfterReturning(value = "pointcut1()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法返回值为：" + result);
    }

    @AfterThrowing(value = "pointcut1()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛出异常了，异常是：" + e.getMessage());
    }

    @Around("pointcut1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String name = proceedingJoinPoint.getSignature().getName();
        System.out.println(name+"方法环绕1");
        Object result = proceedingJoinPoint.proceed();
        System.out.println(name+"方法环绕2");
        return result;
    }
}

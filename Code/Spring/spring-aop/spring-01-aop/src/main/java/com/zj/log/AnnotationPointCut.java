package com.zj.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * 使用注解方式
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.zj.log.AnnotationPointCut.*(..))")
    public void before(){
        System.out.println("-------方法执行前-------");
    }
    @After(("execution(* com.zj.log.AnnotationPointCut.*(..))"))
    public void after(){
        System.out.println("-------方法执行前-------");
    }

    @Around(("execution(* com.zj.log.AnnotationPointCut.*(..))"))
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }

}

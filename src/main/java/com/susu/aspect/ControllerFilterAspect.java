package com.susu.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ControllerFilterAspect {

    @Pointcut("execution(* com.susu.controller..*.*(..))")
    public void controllerPoint() { }

    @Before("controllerPoint()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("this is before");
        joinPoint.getArgs();
    }
}

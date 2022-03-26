package com.just.aspects;

import com.just.annotations.Api;
import com.just.utils.RequestUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 22454
 */
@Aspect
@Component
public class RequestAspect {

    @Pointcut("@annotation(com.just.annotations.Api)")
    public void cut() {
    }

    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        Api api = method.getAnnotation(Api.class);
        String url = api.url();
        return RequestUtil.get(url, null);
    }

    private boolean checkInterface(Class<?> clazz) {
        if (!clazz.isInterface()) {
            throw new RuntimeException("OpenApi must be a interface");
        }
        return true;
    }
}

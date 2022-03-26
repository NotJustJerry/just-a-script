package com.just.proxy;

import com.just.utils.RequestUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 22454
 */
public class OpenApiProxyHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        return RequestUtil.handleApiAnnotation(proxy,method,args);
    }
}

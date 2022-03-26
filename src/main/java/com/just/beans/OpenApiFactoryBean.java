package com.just.beans;

import com.just.proxy.OpenApiProxyHandler;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author 22454
 */
public class OpenApiFactoryBean<T> implements FactoryBean<T> {
    private final Class<T> beanClass;

    public OpenApiFactoryBean(Class<T> beanClass) {
        this.beanClass = beanClass;
    }

    @Override
    public T getObject() {
        return (T) Proxy.newProxyInstance(
                OpenApiFactoryBean.class.getClassLoader(),
                new Class[]{beanClass},
                new OpenApiProxyHandler());
    }

    @Override
    public Class<T> getObjectType() {
        return beanClass;
    }
}

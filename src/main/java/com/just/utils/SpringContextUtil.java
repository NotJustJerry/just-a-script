package com.just.utils;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 22454
 */
@Order(0)
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @SneakyThrows
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    @SneakyThrows
    public static <T> T getBean(String beanName, Class<T> cls) {
        return applicationContext.getBean(beanName, cls);
    }

    @SneakyThrows
    public static <T> T getBean(Class<T> cls) {
        return applicationContext.getBean(cls);
    }

    public static List<Object> getBeans(Class<? extends Annotation> annotationClass){
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(annotationClass);
        return new ArrayList<>(beansWithAnnotation.values());
    }
}

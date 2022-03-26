package com.just.annotations;

import com.just.beans.OpenApiBeanDefinitionRegister;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @author 22454
 */
@Order(0)
@Documented
@Configuration
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({OpenApiBeanDefinitionRegister.class})
public @interface EnableOpenApi {
    String[] baseScanPackages();
}

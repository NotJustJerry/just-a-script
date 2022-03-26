package com.just.service;

import com.just.annotations.Api;
import com.just.annotations.OpenApi;

/**
 * @author 22454
 */
@OpenApi
public interface Test {
    /**
     * test
     */
    @Api(url = "http://www.baidu.com")
    String test();
}

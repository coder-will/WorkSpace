package com.zj.config;

import com.zj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 相当于applicationcontext里头的那一大堆<beans>
 *
 * </beans>
 */
@Configuration
public class MyConfig {


    /**
     * 相当于<
     *
     *
     */
    @Bean
    public User getUser(){
        return new User();
    }

}

package com.zj.config;

import com.zj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//加上Configuration就相当于我们在ApplicationContext.xml中写到的<Beans></Beans>
@Configuration
public class MyConfig {
    //Bean就相当于<Bean></Bean>
    @Bean
    public User getUser(){
        return new User();
    }
    /**
     * 上面就相当于:
     * <beans.....>
     *  <bean id="getUser" class=.....user>
     *
     *   </bean>
     * </beans>
     */
}

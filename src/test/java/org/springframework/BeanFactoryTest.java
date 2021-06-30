package org.springframework;

import org.junit.Test;
import org.springframework.bean.UserService;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}

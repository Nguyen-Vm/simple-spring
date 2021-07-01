package org.springframework;

import org.junit.Test;
import org.springframework.bean.UserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        String beanName = "userService";
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(beanName, beanDefinition);

        // 3.获取Bean
        UserService userService = (UserService) beanFactory.getBean(beanName, "阮威敏");
        userService.queryUserInfo();

    }
}

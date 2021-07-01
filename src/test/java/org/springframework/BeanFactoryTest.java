package org.springframework;

import org.junit.Test;
import org.springframework.bean.UserDao;
import org.springframework.bean.UserService;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanReference;
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
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("no", "GSZN11374"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);

        beanFactory.registerBeanDefinition(beanName, beanDefinition);

        BeanDefinition userDaoBeanDefinition = new BeanDefinition(UserDao.class);
        beanFactory.registerBeanDefinition("userDao", userDaoBeanDefinition);

        // 3.获取Bean
        UserService userService = (UserService) beanFactory.getBean(beanName, "阮威敏");
        String userName = userService.queryUserInfo();
        System.out.println(userService.getName() + " " + userService.getNo() + " " + userName);

    }
}

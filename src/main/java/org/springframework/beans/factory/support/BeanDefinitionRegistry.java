package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean定义 注册中心接口，负责注册Bean，获取相应的Bean。
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册Bean定义
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

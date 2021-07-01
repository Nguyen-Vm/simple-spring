package org.springframework.beans.factory.config;

/**
 * Bean实例 注册中心接口，缓存已实例化的Bean对象。
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}

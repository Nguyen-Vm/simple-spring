package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * Bean工厂接口
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public interface BeanFactory {

    /**
     * 获取Bean
     *
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     * 指定构造器参数 获取Bean
     *
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;
}

package org.springframework.beans.factory.config;

/**
 * Bean定义
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}

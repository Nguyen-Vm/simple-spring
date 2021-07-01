package org.springframework.beans.factory.config;

/**
 * TODO
 *
 * @author 阮威敏
 * @since 01.07.2021
 */
public class BeanReference {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}

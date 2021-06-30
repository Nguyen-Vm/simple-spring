package org.springframework;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}

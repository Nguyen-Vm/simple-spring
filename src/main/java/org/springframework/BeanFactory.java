package org.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 阮威敏
 * <p>
 * 实践是校验真理的唯一标准
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}

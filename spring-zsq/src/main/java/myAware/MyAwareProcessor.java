package myAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.*;

/**
 * 暂时没有实现
 */
public class MyAwareProcessor implements BeanPostProcessor {
    private final ConfigurableApplicationContext applicationContext;

    public MyAwareProcessor(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }



}

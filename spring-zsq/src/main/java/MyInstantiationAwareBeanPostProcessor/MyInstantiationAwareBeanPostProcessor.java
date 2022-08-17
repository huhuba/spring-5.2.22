package MyInstantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    //实例化之前执行
    @Override//Instantiation:实例化   Initialization:初始化
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == BeforeInstantiation.class) {
            System.out.println("代理开始之前");
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(beanClass);
            enhancer.setCallback(new MyMethodInterceptor());
            BeforeInstantiation o = (BeforeInstantiation) enhancer.create();
            System.out.println("代理开始之后");
            return o;
        }
        return null;
    }
    //实例化之后调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        return false;
    }
    //初始化之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }
    //初始化之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }

    @Override
    public String toString() {
        return "MyInstantiationAwareBeanPostProcessor.toString";
    }
}

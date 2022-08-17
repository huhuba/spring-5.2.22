package BFPPorBPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyBeanDefinitionRegistryPostProcessor  implements BeanDefinitionRegistryPostProcessor {
    /**
     * 对BeanFactory进行操作
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
        System.out.println("beanFactory = " + beanFactory);
    }

    /**
     * <ul>对BeanDefinition的数目进行操作
     * <li>也可以进行赋值</li>
     * <li>这个是进行了新BeanDefinitin的注册。</li>
     * </ul>
     * @param registry the bean definition registry used by the application context
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Teacher.class);
        builder.addPropertyValue("name","zsqqqqqqq");
        //注册一个新的BeanDefinition
        registry.registerBeanDefinition("teacher",builder.getBeanDefinition());
    }
}

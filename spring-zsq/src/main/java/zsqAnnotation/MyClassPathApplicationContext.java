package zsqAnnotation;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext  {
    /***
     * 传入资源位置
     * @param configLocations
     */
    public MyClassPathApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        /* 扩展 initPropertySources*/
        super.initPropertySources();
//        getEnvironment().setRequiredProperties("abc");
//        System.out.println("getEnvironment() = " + getEnvironment());
    }

    @Override
    protected void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        super.registerBeanPostProcessors(beanFactory);


    }
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.customizeBeanFactory(beanFactory);
    }


}

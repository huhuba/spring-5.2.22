package BFPPorBPP;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    public MyClassPathXmlApplicationContext(String str) {
        super(str);
    }


    @Override
    public List<BeanFactoryPostProcessor> getBeanFactoryPostProcessors() {
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        return super.getBeanFactoryPostProcessors();
    }
}

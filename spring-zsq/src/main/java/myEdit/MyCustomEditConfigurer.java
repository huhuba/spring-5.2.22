package myEdit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

@Component
public class MyCustomEditConfigurer extends CustomEditorConfigurer {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<Class<?>, Class<? extends PropertyEditor>> customEditors = new HashMap<>();
        //CustomEditorConfigurer类中，customEditors变量，一开始为空引用，需要赋值实例变量的引用。
        setCustomEditors(customEditors);
        addPropertyEditor(Address.class, AddressPropertyEditor.class);
        super.postProcessBeanFactory(beanFactory);
    }
}


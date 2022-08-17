package myEdit;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * 自定义属性编辑器的注册器
 *  1：实现PropertyEditorRedistrar
 *  2:覆写 registerCustomEditors方法，注册自定义的属性编辑器
 */
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        //注册 类和属性编辑器的关系
        registry.registerCustomEditor(Address.class,new AddressPropertyEditor());
    }
}

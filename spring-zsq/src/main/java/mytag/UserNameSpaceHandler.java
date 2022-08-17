package mytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        /* 一个标签 注册一个   parser*/
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
        registerBeanDefinitionParser("bean1", new BeanBeanDefinitionParser());
    }
}

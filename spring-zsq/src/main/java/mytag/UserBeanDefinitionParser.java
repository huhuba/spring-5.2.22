package mytag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        if (StringUtils.hasLength(id)){
            builder.addPropertyValue("id",id);
        }
        String name = element.getAttribute("name");
        if (StringUtils.hasLength(name)){
            builder.addPropertyValue("name",name);
        }
        String age = element.getAttribute("age");
        if (StringUtils.hasLength(age)){
            builder.addPropertyValue("age",age);
        }
        String income = element.getAttribute("income");
        if (StringUtils.hasLength(income)){
            builder.addPropertyValue("income",income);
        }

    }
}

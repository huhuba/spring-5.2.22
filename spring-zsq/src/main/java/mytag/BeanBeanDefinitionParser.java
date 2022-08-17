package mytag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class BeanBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Bean1.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        if (StringUtils.hasLength(id)) {
            builder.addPropertyValue("id", id);
        }
        String name = element.getAttribute("name");
        if (StringUtils.hasLength(name)) {
            builder.addPropertyValue("name", name);
        }

    }
}

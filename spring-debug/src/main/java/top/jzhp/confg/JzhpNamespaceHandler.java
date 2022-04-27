package top.jzhp.confg;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class JzhpNamespaceHandler extends NamespaceHandlerSupport {


    @Override
    public void init() {

        registerBeanDefinitionParser("test", new JzhpBeanDefinitionParser());
    }
}

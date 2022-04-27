package top.jzhp.test.mergelocalbeandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeLocalBeanDefinitionTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/test/mergelocalbeandefinition/beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}

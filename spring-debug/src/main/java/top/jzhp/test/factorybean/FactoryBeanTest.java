package top.jzhp.test.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    public static void main(String[] args) throws Exception {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:test/factorybean/factorybean.xml");

        PersonFactoryBean personFactoryBean = (PersonFactoryBean) applicationContext.getBean("&personFactory");

        System.out.println(personFactoryBean);

        Person person1 = (Person) applicationContext.getBean("personFactory");
        Person person2 = (Person) applicationContext.getBean("personFactory");


        System.out.println(person1);
        System.out.println(person2);
    }
}



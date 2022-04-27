package top.jzhp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-${user}-student.xml");

        //Object student = applicationContext.getBean("jzhpTest");
        //
        // Object student = applicationContext.getBean("jzhpTest");

        JzhpTest bean = applicationContext.getBean(JzhpTest.class);

        System.out.println(bean);
    }
}

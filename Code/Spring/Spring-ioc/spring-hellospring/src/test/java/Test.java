import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;

public class Test {

    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.toString());
    }

}

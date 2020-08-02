import dao.UserDaoImpl;
import dao.UserDaoMysqlImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImpl;

public class Test {




    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserServiceImpl userserviceimpl = (UserServiceImpl) context.getBean("userserviceimpl");
        userserviceimpl.getUser();


    }

}

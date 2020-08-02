import com.zj.pojo.Books;
import com.zj.service.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl) context.getBean("bookServiceImpl");
        for (Books queryBook : bookServiceImpl.queryBooks()) {
            System.out.println(queryBook);
        }
    }
}

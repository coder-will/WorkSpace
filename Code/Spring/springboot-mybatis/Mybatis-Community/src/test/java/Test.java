import com.zj.dao.UserDao;
import com.zj.dao.UserDaoImpl;
import com.zj.dao.UserDaoImpl2;
import com.zj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {

    @org.junit.Test
    public void selectUser() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserDaoImpl2 bean = context.getBean(UserDaoImpl2.class);
        List<User> users = bean.selectUser();
        for (User user : users) {
            System.out.println(user);

        }

    }
}

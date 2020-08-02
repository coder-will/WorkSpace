import com.zj.pojo.User;
import com.zj.pojo.mapper.UserMapperImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapperImpl bean = context.getBean(UserMapperImpl.class);
        List<User> select = bean.select();
        for (User user : select) {
            System.out.println(user);

        }
    }
}

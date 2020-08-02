import com.zj.pojo.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
@org.junit.Test
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    People people = (People) context.getBean("people");
    people.getDog().shout();
    people.getCat().shout();


}
}

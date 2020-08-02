import com.zj.log.AnnotationPointCut;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AnnotationPointCut bean = context.getBean(AnnotationPointCut.class);

    }
}

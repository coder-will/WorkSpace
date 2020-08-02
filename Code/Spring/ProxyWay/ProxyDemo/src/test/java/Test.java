import com.zj.ServiceImpl;
import com.zj.ServiceProxyImpl;

public class Test {

    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ServiceProxyImpl serviceProxy = new ServiceProxyImpl();
        serviceProxy.setServiceimpl(service);
        serviceProxy.query();
    }
}

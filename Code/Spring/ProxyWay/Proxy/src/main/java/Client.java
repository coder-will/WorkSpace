/**
 *
 * 客户，一般都会去找中介也就是我们的代理角色租房子
 *
 */

public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }


}

/**
 *
 *
 * 代理角色：中介
 *
 * 中介也会调用租房接口，来实现它的某些功能
 */


public class Proxy implements Rent{
    private Host host;
    public Proxy(){

    }
    //代理 代表了房东
    public Proxy(Host host){
        this.host=host;
    }
    //租房
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    //看房子
    public void seeHouse(){
        System.out.println("带房客看房子");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}

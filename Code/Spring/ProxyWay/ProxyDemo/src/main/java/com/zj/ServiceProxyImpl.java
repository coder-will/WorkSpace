package com.zj;



public class ServiceProxyImpl implements service{
    private ServiceImpl serviceimpl;

    public ServiceProxyImpl(){

    }

    public void setServiceimpl(ServiceImpl serviceimpl){
        this.serviceimpl = serviceimpl;

    }

    public void query() {
        log("a");
        serviceimpl.query();
    }

    public void delete() {
        log("a");
        serviceimpl.delete();
    }

    public void update() {
        log("a");
        serviceimpl.update();
    }

    public void insert() {
        log("a");
        serviceimpl.insert();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}

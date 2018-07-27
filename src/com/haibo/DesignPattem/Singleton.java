package com.haibo.DesignPattem;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/21/021
 * 单例设计模式
 */
public class Singleton {
    public static void main(String[] args) {
        SingleObject object= SingleObject.getInstance();
        object.showMessage();
    }
}
 class SingleObject{
    private static SingleObject instance=new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.print("hello world");
    }
}
//饿汉式
class SingleHungry{
    private final static SingleHungry instance=new SingleHungry();
    private SingleHungry(){};
    public static SingleHungry getInstance(){
        return instance;
    }

}
//懒汉式：线程安全
class SingleLazy{
    private static SingleLazy s=null;
    private SingleLazy(){}
    public static SingleLazy getInstance(){
        if(s==null){
            synchronized(SingleLazy.class)
            {
                if(s==null)
                    s=new SingleLazy();
            }
        }
        return s;
    }
}



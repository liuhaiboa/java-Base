package com.haibo.EffectiveJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhaibo on 18/11/22.
 */
public class num1 {


    public static void main(String[] args) {


        Map<String, Long> map=new HashMap<>();
        //System.currentTimeMillis() / 1000;
        map.put("time",System.currentTimeMillis()/1000);
        System.out.println(map.get("time"));
    }


    private  String name;
    private  int num;
    private  int age;

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getAge() {
        return age;
    }



    public num1(String name, int num, int age) {
        this.name = name;
        this.num = num;
        this.age = age;
    }
    public num1(){}

    /**
     * 使用工厂方法代替构造器
     */
    public void fanction1() {
        //理想是这样使用工厂方法代替构造器.....但是还是消停眯着吧！！
        Map<String, String> map = new HashMap<String, String>();
//    public static <K,V> HashMap<K,V> newInstance(){
//        return new HashMap<K, V>();
        // }
        //Map<String,String> map1=HashMap.newInstance();

    }

    /**
     * 构造器参数多用建造器
     */
    public void fanction2(){


    }

}

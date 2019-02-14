package com.haibo.day1.xunhuan;

/**
 * Created by liuhaibo on 18/9/5.
 */
public class caseString {

    public static void main(String[] args) {

caseString caseString=new caseString();

        String ject="weishop";
        st(ject);



    }

    public String getPushObject() {
        return pushObject;
    }

    public void setPushObject(String pushObject) {
        this.pushObject = pushObject;
    }

    private static String pushObject;

     public static void st(String pushObject){

        switch (pushObject){

        case "weishop":
            System.out.println("1");
            break;
        case "weishop2":
            System.out.println("2");
            break;
    }
}

}


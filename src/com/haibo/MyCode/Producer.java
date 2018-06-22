package com.haibo.MyCode;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/12/012
 */
public class Producer {

}

class Message {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Producer1 implements Runnable{
    private Message msg=null;


    @Override
    public void run() {

    }
}
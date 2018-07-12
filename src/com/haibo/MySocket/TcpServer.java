package com.haibo.MySocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/22/022
 */
public class TcpServer {//服务器端
    public static void main(String[] args) {
        try {
            //建立服务器端socket服务，并监听一个端口
            ServerSocket ss=new ServerSocket(10003);
            //通过accept方法获取连接过来的客户端对象
            Socket s=ss.accept();
            String ip=s.getInetAddress().getHostAddress();
            System.out.println(ip+"....connected");
            //获取客户端发送过来的数据，使用客户端读取流读取
            InputStream in=s.getInputStream();
            byte[] buf=new byte[1024];
            int len=in.read(buf);
            System.out.println(new String(buf,0,len));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
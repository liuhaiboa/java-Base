package com.haibo.MySocket;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/22/022
 */
public class TcpClient {//客户端
    public static void main(String[] args) {
        try {//1创建客户端的soclet服务，指定目的主机和端口
            Socket s= new Socket("192.168.1.102",10003);
            //2获取socket流中的输出流，3关闭
            OutputStream out=s.getOutputStream();
            out.write("tcpSabber".getBytes());
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
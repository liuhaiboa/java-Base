package com.haibo.MySocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/22/022
 */
public class UdpRece {
    public static void main(String[] args) {
        try {//1.创建udpsocket服务，建立端点.监听一个接口
            DatagramSocket ds=new DatagramSocket(10000);
            //2.定义一个数据包存储接收到的字节数据。
            while(true){
            byte[] buf=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buf,buf.length);
            //3.通过socket服务的receive方法将收到的数据出存入已定义好的数据包
            ds.receive(dp);
            //4.通过数据包对象的特有功能将不同的数据取出，打印到控制台
            String ip=dp.getAddress().getHostAddress();
            String data= new String(dp.getData(),0,dp.getLength());
            int port=dp.getPort();
            System.out.print(ip+data+port);
            }
            //5.关闭资源
           // ds.close();
        } catch (Exception e) {
            e.printStackTrace();}
    }
}
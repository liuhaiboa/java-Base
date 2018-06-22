package com.haibo.MySocket;

import java.io.IOException;
import java.net.*;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/22/022
 */
public class UdpSend {
    public static void main(String[] args) {
        try {//1通过udp服务，通过DatagramSocket对象。
            DatagramSocket ds=new DatagramSocket();
            //2确定数据，并封装成数据包
            byte[] buf ="send Sabber".getBytes();
            DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.107"),10000);
            //3.通过socket服务，将已有的数据包发送出去。
            ds.send(dp);
            //4.关闭
        } catch (Exception e) {}
    }
}
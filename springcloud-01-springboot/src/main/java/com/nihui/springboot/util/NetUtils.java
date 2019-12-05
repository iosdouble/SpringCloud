package com.nihui.springboot.util;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Classname NetUtils
 * @Description TODO
 * @Date 2019/11/28 10:55 AM
 * @Created by nihui
 */
public class NetUtils {

    /***
     *  true:already in using  false:not using
     * @param port
     */
    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }

    /***
     *  true:already in using  false:not using
     * @param host
     * @param port
     * @throws UnknownHostException
     */
    public static boolean isPortUsing(String host,int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            socket.close();
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }
}

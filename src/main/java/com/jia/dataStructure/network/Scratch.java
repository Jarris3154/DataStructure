package com.jia.dataStructure.network;

import org.apache.commons.net.telnet.TelnetClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarris
 */
public class Scratch {

    public static void main(String[] args){
        List<String> ips = new ArrayList<>();
        for (int i = 2; i <= 254; i++) {
            String ip = "10.169.42."+ i;
            if(telnet(ip)){
                ips.add(ip);
            }
        }
        System.out.println(ips);
    }

    private static boolean telnet(String ipString){
        TelnetClient telnetClient = new TelnetClient();
        telnetClient.setConnectTimeout(100);

        try {
            telnetClient.connect(ipString, 8080);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

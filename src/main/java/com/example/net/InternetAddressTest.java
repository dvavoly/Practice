package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        var address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.nab.com");
        System.out.println(address);

        InetAddress[] sites = InetAddress.getAllByName("www.nba.com");
        for (InetAddress item : sites) {
            System.out.println(item);
        }
    }
}

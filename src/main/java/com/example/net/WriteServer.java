package com.example.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WriteServer {

    public static final int serverPort = 998;
    public static final int clientPort = 999;
    public static final int buffer_size = 1024;
    public static DatagramSocket datagramSocket;
    public static byte[] buffer = new byte[buffer_size];

    public static void theServer() throws Exception {
        int position = 0;
        while (true) {
            int c = System.in.read();
            switch (c) {
                case -1:
                    System.out.println("Server Quits.");
                    datagramSocket.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    datagramSocket.send(new DatagramPacket(buffer, position, InetAddress.getLocalHost(), clientPort));
                    position = 0;
                    break;
                default:
                    buffer[position++] = (byte) c;
            }
        }
    }

    public static void theClient() throws Exception {
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        datagramSocket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength()));
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            datagramSocket = new DatagramSocket(serverPort);
            theServer();
        } else {
            datagramSocket = new DatagramSocket(clientPort);
            theClient();
        }
    }
}

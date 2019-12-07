package udp.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpClientSocket = new DatagramSocket();
        String message = "收到我的消息没？";
        byte[] sendBuffer = message.getBytes("UTF-8");
        // 127.0.0.1   都为自己本机
        byte[] serverIP = new byte[4];
        serverIP[0] = (byte)127;    // (byte)127
        serverIP[1] = (byte)0;      // 0
        serverIP[2] = (byte)0;      // 0
        serverIP[3] = (byte)1;      // 1
        InetAddress serverAddress = InetAddress.getByAddress(serverIP);
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                serverAddress,
                9898
        );
        udpClientSocket.send(sendPacket);

        // 接受对方回应的消息
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(
                receiveBuffer, receiveBuffer.length);
        udpClientSocket.receive(receivePacket);
        String responseMessage = new String(
                receivePacket.getData(),
                0,
                receivePacket.getLength(),
                "UTF-8"
        );
        System.out.println(responseMessage);

        udpClientSocket.close();
    }
}

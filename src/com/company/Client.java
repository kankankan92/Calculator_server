package com.company;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 2007);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите пример: ");
            String string = scan.next();
            System.out.print(string + "=");
            dataOutputStream.writeUTF(string);
            System.out.println(dataInputStream.readInt());

        }
    }
}
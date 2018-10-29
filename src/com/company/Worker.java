package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Worker extends Thread {

    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    Worker(DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.dataInputStream = dataInputStream;
        this.dataOutputStream = dataOutputStream;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String expression;
                expression = dataInputStream.readUTF();
                int res = Calculator.calculator(expression);
                dataOutputStream.writeInt(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

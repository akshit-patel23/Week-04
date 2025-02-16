package javastreams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadThread extends Thread {
    private PipedInputStream pis;

    public ReadThread(PipedInputStream pis){
        this.pis=pis;
    }
    @Override
    public void run(){
        try{
            int data;
            System.out.print("Reader Received: ");
            while ((data = pis.read()) != -1) { // Reading data
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}

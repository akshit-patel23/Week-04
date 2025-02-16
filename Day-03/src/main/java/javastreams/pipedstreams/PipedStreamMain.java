package javastreams.pipedstreams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamMain {
    public static void main(String[] args) {
        try{
            PipedInputStream pis=new PipedInputStream();
            PipedOutputStream pos=new PipedOutputStream();

            pos.connect(pis);

            Thread writer=new WriteThread(pos);
            Thread reader=new ReadThread(pis);

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

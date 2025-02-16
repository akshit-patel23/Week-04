package javastreams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteThread extends Thread{
    private PipedOutputStream pos;

    public WriteThread(PipedOutputStream pos) {
        this.pos = pos;
    }
@Override
    public void run() {
        try {
            String message = "Hello Dev this side!";
            pos.write(message.getBytes()); // Writing data to stream
            pos.close(); // Closing stream after writing
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}

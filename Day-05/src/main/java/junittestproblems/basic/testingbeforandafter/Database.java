package junittestproblems.basic.testingbeforandafter;

public class Database {
    static boolean isConnected;
    public static void connect(){
        isConnected=true;
        System.out.println("Connected");
    }
    public static void disconnect(){
        isConnected=false;
        System.out.println("disconnected");
    }
    public static boolean isConnected() {
        return isConnected;
    }
}

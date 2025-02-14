package exceptionhandling.multiplecatchblocks;

public class Main {
    public static void main(String[] args) {
        int [] arr= {1,3,6,8,9};

        MultipleException mult= new MultipleException();
        mult.arrException(arr,5);
        mult.arrException(arr, 7);
        int []arr2=null;
        mult.arrException(arr2,0);
    }
}

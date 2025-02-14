package exceptionhandling.multiplecatchblocks;

public class MultipleException {
    public void arrException(int[] arr,int index){
        try {

            int res= arr[index];
            System.out.println("Value at index "+index+":"+res);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Array has no elements "+e.getMessage());
        }

    }
}

package junittestproblems.advance.bankingtransactions;

public class BankMain {
    public static void main(String[] args) {
        Bank customer=new Bank(2000,"Dev");
        try{
        customer.setWithdrawl(5000);}
        catch (IllegalArgumentException e){
            System.out.println("Error :- "+e.getMessage());
        }
    }
}

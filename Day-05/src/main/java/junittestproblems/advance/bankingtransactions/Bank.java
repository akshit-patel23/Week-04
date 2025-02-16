package junittestproblems.advance.bankingtransactions;

public class Bank {
    private double amount,withdrawl;
    private String name;
    public Bank(double amount,String name){
        this.name=name;
        this.amount=amount;
    }
    public void setWithdrawl(double withdrawl){
        if(withdrawl>amount){
            throw new IllegalArgumentException("Your account has insufficient balance");
        }
    }

}

class BankAccount {
    private int AccNum;
    private String AccHolder;
    private float balance;
    int amount;
    void deposite(int amount){
        if(amount>0)
      balance+=amount;
    }
    void Withdraw(int amount){
        if(balance>amount)
        balance-=amount;
    }
    void Display(int AccNum,String AccHolder){
        System.out.println(AccNum+" "+AccHolder+" "+balance);
    }
}
public class Encapsulation {
    public static void main(String[] arg) {
        BankAccount obj = new BankAccount();
        obj.deposite(1000);
        obj.Withdraw(500);
        obj.Display(1234,"kani");
    }
}
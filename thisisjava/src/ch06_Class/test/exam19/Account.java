package ch06_Class.test.exam19;

public class Account {

    private int balance;
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance <= Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
            // if(balance<=MIN_BALANCE || balance>MAX_BALANCE){
            // this.balance=getBalance();
            return;
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재잔고:" + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재잔고:" + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재잔고:" + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재잔고:" + account.getBalance());
    }
}

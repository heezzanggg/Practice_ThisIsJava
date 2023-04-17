package ch06_Class.test.exam19;

public class Account2 {
  // 필드
  private int balance;// 잔고
  private static final int MIN_BALANCE = 0;
  private static final int MAX_BALANCE = 1000000;

  // getter
  public int getBalance() {
    return balance;
  }

  // setter
  public void setBalance(int balance) {
    if (balance <= MIN_BALANCE || balance > MAX_BALANCE) {
      return;
    } else {
      this.balance = balance;
    }
  }

  public static void main(String[] args) {
    Account2 account2 = new Account2();

    account2.setBalance(10000);
    System.out.println("현재잔고 : " + account2.getBalance());

    account2.setBalance(-100);
    System.out.println("현재잔고: " + account2.getBalance());

    account2.setBalance(2000000);
    System.out.println("현재잔고: " + account2.getBalance());

    account2.setBalance(300000);
    System.out.println("현재잔고: " + account2.getBalance());

  }
}

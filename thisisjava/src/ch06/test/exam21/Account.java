package ch06.test.exam21;

public class Account {
  private String accountNum; // 계좌번호
  private String owner; // 계좌주
  private int balance; // 잔액

  public Account(String accountNum, String owner, int balance) {
    this.accountNum = accountNum;
    this.owner = owner;
    this.balance = balance;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account [accountNum=" + accountNum + ", owner=" + owner + ", balance=" + balance + "]";
  }

}

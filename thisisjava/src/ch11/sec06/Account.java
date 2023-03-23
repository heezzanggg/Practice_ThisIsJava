package ch11.sec06;

public class Account {
  // 필드
  private long balance;

  // 생성자
  public Account() {
  }

  // 메소드
  public long getBalance() {
    return balance;
  }

  public void deposit(int money) {
    balance += money;
  }

  public void withdraw(int money) throws InsufficientException { // 호출한곳으로 예외 떠넘김
    if (balance < money) {
      throw new InsufficientException("잔고부족: " + (money - balance) + "모자람"); // 예외발생
    }
    balance -= money;
  }

}

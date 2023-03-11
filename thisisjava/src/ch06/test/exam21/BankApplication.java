package ch06.test.exam21;

import java.util.Scanner;

public class BankApplication {
  private static Scanner sc = new Scanner(System.in);
  private static Account[] arrAccounts = new Account[100];

  public static void main(String[] args) {
    while (true) {
      System.out.println("--------------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("--------------------------------------------------");

      System.out.print("선택> ");
      int selectNum = sc.nextInt();

      if (selectNum == 1) {
        createAccount();
      } else if (selectNum == 2) {
        readAccount();
      } else if (selectNum == 3) {
        deposit();
      } else if (selectNum == 4) {
        withdraw();
      } else {
        System.out.println("프로그램 종료");
        break;
      }
    }

  }

  // 계좌생성
  public static void createAccount() {
    System.out.println("----------");
    System.out.println("계좌생성");
    System.out.println("----------");

    System.out.print("계좌번호: ");
    String accountNum = sc.next();

    System.out.print("계좌주: ");
    String owner = sc.next();

    System.out.print("초기입급금액: ");
    int balance = sc.nextInt();

    Account newAccount = new Account(accountNum, owner, balance);

    for (int i = 0; i < arrAccounts.length; i++) {
      if (arrAccounts[i] == null) {
        arrAccounts[i] = newAccount;
        System.out.println("결과: 계좌가 생성되었습니다.");
        break;
      }
    }
    // for (int i = 0; i < arrAccounts.length; i++) {
    // if (arrAccounts[i] != null) {
    // System.out.println(arrAccounts[i].getAccountNum());
    // System.out.println(arrAccounts[i].getOwner());
    // System.out.println(arrAccounts[i].getBalance());
    // System.out.println(arrAccounts[i].toString());
    // }
    // }
  }

  // 계좌목록
  public static void readAccount() {
    System.out.println("----------");
    System.out.println("계좌목록");
    System.out.println("----------");

    for (int i = 0; i < arrAccounts.length; i++) {
      if (arrAccounts[i] != null) {
        System.out.print(arrAccounts[i].getAccountNum() + "    ");
        System.out.print(arrAccounts[i].getOwner() + "    ");
        System.out.println(arrAccounts[i].getBalance());
      }
    }
  }

  // 예금
  public static void deposit() {
    System.out.println("----------");
    System.out.println("예금");
    System.out.println("----------");

    System.out.print("계좌번호: ");
    String accountNum = sc.next();

    System.out.print("예금액: ");
    int money = sc.nextInt();

    Account account = findAccount(accountNum);
    // System.out.println("선택한넘버:" + account);
    if (account == null) {
      System.out.println("계좌번호 없습니다.");
    } else {
      account.setBalance(account.getBalance() + money);
      System.out.println("결과: 예금이 성공되었습니다.");
    }

  }

  // 출금
  public static void withdraw() {
    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");

    System.out.print("계좌번호: ");
    String accountNum = sc.next();

    System.out.print("출금액: ");
    int money = sc.nextInt();

    // 입력된 계좌번호로 계좌번호리스트에있는 계좌 찾아서
    // 입력받은 출금액을 기존 잔액에서 빼줌
    Account account = findAccount(accountNum);
    if (account == null) {
      System.out.println("계좌번호 없습니다.");
    } else {
      account.setBalance(account.getBalance() - money);
      System.out.println("결과: 출금이 성공되었습니다.");
    }
  }

  // Account 배열에서 accounNum와 동일한 Account 객체찾기
  static Account findAccount(String accountNum) {
    Account account = null;
    for (int i = 0; i < arrAccounts.length; i++) {
      if (arrAccounts[i] != null) {
        String dbAccountNum = arrAccounts[i].getAccountNum();
        if (dbAccountNum.equals(accountNum)) {
          account = arrAccounts[i];
          break;
        }
      }
    }
    return account;
  }
}

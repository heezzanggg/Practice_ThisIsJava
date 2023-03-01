package ch05.sec05_String;

public class SubStringExample {
  public static void main(String[] args) {
    String ssn = "950624-1230123";

    String firstNum = ssn.substring(0, 6); // 0부터 6앞까지
    String secondNum = ssn.substring(7); // 7부터 끝까지
    System.out.println("firstNum:" + firstNum);
    System.out.println("secondNum:" + secondNum);
  }
}

// substring(int beginIndex) : beginIndex에서 끝까지 잘라내기
// substring(int beginIndex, int endIndex) : beginIndex에서 endIndex 앞까지 잘라내기
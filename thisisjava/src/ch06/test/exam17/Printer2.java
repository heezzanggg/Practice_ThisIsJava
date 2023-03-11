package ch06.test.exam17;

public class Printer2 {
  // 메소드 오버로딩 이용!!! =>오버로딩? 같은 클래스내에 메소드 이름이 같으나 파라미터의 갯수, 종류등을 다르게 정의하는 것!
  static void println(int value) {
    System.out.println(value);
  }

  static void println(boolean value) {
    System.out.println(value);
  }

  static void println(double value) {
    System.out.println(value);
  }

  static void println(String value) {
    System.out.println(value);
  }

  public static void main(String[] args) {
    Printer2.println(10);
    Printer2.println(true);
    Printer2.println(5.7);
    Printer2.println("홍길동");
  }
}

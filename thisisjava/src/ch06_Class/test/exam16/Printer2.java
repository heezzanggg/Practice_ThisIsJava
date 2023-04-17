package ch06_Class.test.exam16;

public class Printer2 {
  // 메소드 오버로딩 이용!!! =>오버로딩? 같은 클래스내에 메소드 이름이 같으나 파라미터의 갯수, 종류등을 다르게 정의하는 것!
  void println(int value) {
    System.out.println(value);
  }

  void println(boolean value) {
    System.out.println(value);
  }

  void println(double value) {
    System.out.println(value);
  }

  void println(String value) {
    System.out.println(value);
  }

  public static void main(String[] args) {
    Printer2 printer2 = new Printer2();
    printer2.println(10);
    printer2.println(true);
    printer2.println(5.7);
    printer2.println("홍길동");
  }
}

package ch11.sec05;

public class ThrowsExample1 {
  public static void main(String[] args) {

    try {
      findClass(); // 메소드 호출한 곳에서 예외 처리
    } catch (ClassNotFoundException e) {
      // TODO: handle exception
      System.out.println("예외처리:" + e.toString());
    }

  }

  public static void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");

  }
}

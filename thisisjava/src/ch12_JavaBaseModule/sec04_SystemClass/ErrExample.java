package ch12_JavaBaseModule.sec04_SystemClass;

public class ErrExample {
  public static void main(String[] args) {
    try {
      int value = Integer.parseInt("1oo");
    } catch (NumberFormatException e) {
      // TODO: handle exception
      System.err.println("에러내용");
      System.err.println(e.getMessage());
    }
  }
}

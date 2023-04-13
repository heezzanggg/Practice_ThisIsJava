package ch12.test.exam09;

public class DecodingExample {
  public static void main(String[] args) {
    byte[] bytes = { -20, -107, -120, -21, -123, -107 };
    // byte -> String
    String str = new String(bytes);
    System.out.println("str: " + str);
  }
}

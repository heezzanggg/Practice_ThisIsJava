package ch12.test.exam10;

public class testStringBuilder {
  public static void main(String[] args) {
    String str = "";
    for (int i = 1; i <= 100; i++) {
      str += i;
    }
    System.out.println(str);
    System.out.println("-------------------");

    String newStr = "";
    for (int i = 1; i <= 100; i++) {
      newStr += new StringBuilder().append(i).toString();
    }

    System.out.println(newStr);

  }
}

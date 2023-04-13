package ch12.test.exam11;

import java.util.StringTokenizer;

public class TestStringTokenizer {
  public static void main(String[] args) {
    String str = "아이디,이름,패스워드";

    String[] arr = str.split(",");
    for (String token : arr) {
      System.out.println(token);
    }

    System.out.println("==================");

    StringTokenizer st = new StringTokenizer(str, ",");

    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      System.out.println(token);
    }
  }
}

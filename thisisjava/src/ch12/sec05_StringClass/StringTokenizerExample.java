package ch12.sec05_StringClass;

import java.util.StringTokenizer;

public class StringTokenizerExample {
  public static void main(String[] args) {
    String data1 = "홍길동&이수홍,박연수";
    String[] arr = data1.split("&|,");
    for (String token : arr) {
      System.out.println(token);
    }
    System.out.println();

    String data2 = "홍길동/이수홍/박연수";
    StringTokenizer st = new StringTokenizer(data2, "/");
    System.out.println(st.countTokens()); // countTokens() : 분리할 수 있는 문자열의 총 수
    while (st.hasMoreTokens()) { // hasMoreTokens() : 남아있는 문자열이 있는지 여부
      System.out.println(st.hasMoreTokens());
      String token = st.nextToken(); // nextToken() : 문자열을 하나씩 가져옴
      System.out.println(token);
    }
  }
}

// split : 정규식으로 구분 &(엔드) ,(쉼표) -(하이픈)
// StringTokenizer : 문자로 구분
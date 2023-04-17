package ch05_ReferenceType.sec05_String;

public class LengthExampel {
  public static void main(String[] args) {
    String ssn = "9506241230123";
    int length = ssn.length();
    if (length == 13) {
      System.out.println("주민등록번호 자릿수 맞음");
    } else {
      System.out.println("주민등록번호 자릿수 틀림");
    }
  }
}

package ch05_ReferenceType.sec05_String;

public class IndexOfContainsExample {
  public static void main(String[] args) {

    String subject = "자바 프로그래밍";

    int location = subject.indexOf("프로그래밍");
    System.out.println(location); // 3

    String substring = subject.substring(location); // 프로그래밍
    System.out.println(substring);

    location = subject.indexOf("자바"); // 0
    if (location != -1) {
      // 포함되어 있는 경우 (문자열이 포함되어 있지 않으면 indexOf()메소드는 -1 리턴)
      System.out.println("자바와 관련된 책");
    } else {
      System.out.println("자바와 관련 없는 책");
    }

    boolean result = subject.contains("자바");
    if (result) {
      System.out.println("자바와 관련된 책");
    } else {
      System.out.println("자바와 관련 없는 책");
    }
  }
}

// indexOf()
// 문자열에서 특정 문자열의 위치 찾고자 할 때 사용.
// 주어진 문자열이 시작되는 인덱스를 리턴, 주어진 문자열이 포함되어 있지 않으면 -1리턴
// contains()
// 주어진 문자열의 포함여부 확인
// 문자열 포함 되어있으면 true리턴 , 주어진 문자열이 포함되어 있지 않으면 false 리턴
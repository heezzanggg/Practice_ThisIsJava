package ch05.sec04;

public class NullPointerExceptionExample {
  public static void main(String[] args) {
    int[] intArray = null;
    intArray[0] = 10; // NullPointerException
    // intArray가 참조하는 배열 객체가 없으므로 10저장 불가 =>heap영역에 없다는 뜻인가...?

    String str = null;
    System.out.println("총문자수:" + str.length()); // NullPointerException
    // str변수가 참조하는 Srring 객체가 없으므로
  }

}

// NullPointerException
// :예외가 발생된 곳에서 null인 상태의 참조 변수가 사용되고 있음
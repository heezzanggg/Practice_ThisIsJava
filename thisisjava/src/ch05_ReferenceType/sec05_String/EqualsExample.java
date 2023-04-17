package ch05_ReferenceType.sec05_String;

public class EqualsExample {
  public static void main(String[] args) {
    String strVar1 = "홍길동";
    String strVar2 = "홍길동";
    String strVar3 = new String("홍길동");
    String strVar4 = new String("홍길동");
    // 문자열 리터럴 생성 vs new연산자로 생성

    // 문자열 리터럴 생성
    // strVar1 , strVar2 문자열 리터럴이 동일
    // => 각 변수에 동일한 String 객체의 번지가 저장됨 strVar1 == strVar2 (strVar1,strVar2 참조 같음)
    // 자바는 문자열 리터럴이 동일하다면 String객체를 공유하도록 설계되어있으므로

    // new 연산자(새로운 객체를 만드는 연산자)로 객체 생성 하면 새로운 객체번지 가지게됨

    System.out.println("==================문자열 리터럴 생성 비교=======================");

    if (strVar1 == strVar2) {
      System.out.println("strVar1, strVar2 참조 같음");
    } else {
      System.out.println("strVar1, strVar2 참조 다름.");
    }

    if (strVar1.equals(strVar2)) {
      System.out.println("strVar1,strVar2 문자열 같음");
    }

    System.out.println("==================new 연산자 생성 비교=======================");

    if (strVar3 == strVar4) {
      System.out.println("strVar3,strVar3 참조 같음");
    } else {
      System.out.println("strVar3,strVar4 참조 다름");
    }

    if (strVar3.equals(strVar4)) {
      System.out.println("strVar3,strVar4 문자열 같음");
    }

    System.out.println("============문자열 리터럴 생성 VS new 연산자 생성 비교================");

    if (strVar1 == strVar3) {
      System.out.println("strVar1,strVar3 참조 같음");
    } else {
      System.out.println("strVar1,strVar3 참조 다름");
    }

    if (strVar1.equals(strVar3)) {
      System.out.println("strVar1,strVar3 문자열 같음");
    }
  }
}

package ch09.sec05.exam01;

//바깥멤버 접근 : 중첩클래스는 바깥 클래스와 관계를 맺는데, 바깥클래스의 멤버(필드,메소드)에 접근할 수 있지만
// 중첩클래스가 어떻게 선언되느냐에따라 접근 제한 있음
public class A {
  // A인스턴스 필드와 메소드
  int field1;

  void method1() {
  }

  // A의 정적 필드와 메소드
  static int field2;

  static void method2() {
  }

  // 인스턴스 멤버 클래스 =>바깥클래스의 모든 멤버(필드,메소드) 접근 가능
  class B {
    void method() {
      // A의 인스턴스 필드와 메소드 사용
      field1 = 10; // (o)
      method1(); // (o)

      // A의 정적 필드와 메소드 사용
      field2 = 10; // (o)
      method2(); // (o)
    }
  }

  // 정적 멤버 클래스 => 바깥클래스의 정적 필드, 메소드만 사용 가능
  static class C {
    void method() {
      // A의 인스턴스 필드, 메소드 사용 불가
      // field1 = 10;//(x)
      // method1(); //(x)
      // A의 정적 필드, 메소드 사용
      field2 = 10;
      method2();

    }
  }
}

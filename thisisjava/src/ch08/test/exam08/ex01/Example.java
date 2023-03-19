package ch08.test.exam08.ex01;

public class Example {
  public static void action(A a) {
    a.method1();
    if (a instanceof C) {
      C c = (C) a; // 강제타입변환
      c.method2();
    }
  }

  public static void main(String[] args) {
    action(new B());
    action(new C()); // A a = new C(); / 강제 타입 변환 C c = (C) a; =>C의 method2() 이용가능
  }
}

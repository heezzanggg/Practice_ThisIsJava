package ch09.sec06.exam01;

//중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스
public class Button {
  // 정적 중첩 인터페이스
  public static interface ClickListener {// 중첩 인터페이스 선언
    // 추상 메소드
    void onClick();
  }

  // 외부에서 접근 가능 =>public
  // Button 객체없이 사용할 수 있는 static 중첩 인터페이스

}

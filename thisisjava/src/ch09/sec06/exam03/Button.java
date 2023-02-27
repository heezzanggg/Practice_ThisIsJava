package ch09.sec06.exam03;

public class Button {
  // 정적 멤버 인터페이스
  public static interface ClickListener {
    // 추상메소드
    void onClick();
  }

  // 필드
  private ClickListener clickListener;

  // 메소드
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  } // Button이 클릭되었을 때 실행하는 메소드 선언

}

// Button 클래스에 ClickListener타입의 필드와 Setter 추가해서 외부에서 Setter통해 ClickListener 구현
// 객체를 필드에 저장 할 수 있음
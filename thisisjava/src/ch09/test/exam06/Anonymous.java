package ch09.test.exam06;

public class Anonymous {

  // 필드에 익명구현객체 대입
  Vehicle field = new Vehicle() {
    @Override
    public void run() {
      System.out.println("자전거가 달립니다.");
    }
  };

  // 로컬변수 이용
  void method1() {
    // 로컬변수에 익명구현객체 대입
    Vehicle localVar = new Vehicle() {
      @Override
      public void run() {
        System.out.println("승용차가 달립니다.");
      }
    };
    localVar.run();
  }

  // 매개변수 이용
  void method2(Vehicle v) {
    v.run();
  }
}

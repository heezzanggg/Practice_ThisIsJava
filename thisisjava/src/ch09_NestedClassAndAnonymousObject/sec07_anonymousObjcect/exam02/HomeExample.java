package ch09_NestedClassAndAnonymousObject.sec07_anonymousObjcect.exam02;

//익명구현객체 : 인터페이스를 구현해서 생성되고, 생성된객체는 인터페이스 타입의 필드,로컬변수, 매개변수의 값으로 대입 할 수 있다. 
public class HomeExample {
  public static void main(String[] args) {
    // Home 객체 생성
    Home home = new Home();

    // 익명 구현객체가 대입된 필드 사용
    home.use1();

    // 익명 구현 객체가 대입된 로컬 변수 사용
    home.use2();

    // 익명 구현 객체가 대입된 매개변수 사용
    home.use3(new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("난방을 켬");
      }

      @Override
      public void turnOff() {
        System.out.println("난방을 끔");
      }
    });
  }

}

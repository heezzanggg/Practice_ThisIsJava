package ch09.sec07.exam01;

//익명 객체 : 이름 없는 객체.클래스를 상속하거나 인터페이스를 구현해야만 생성 가능
//필드값,로컬 변수값,매개변수값으로 주로 사용 됨
//익명 자식 객체: 익명객체 중 클래스를 상속해서 만들 경우.
//익명 자식 객체는 부모 클래스를 상속받아 생성되고, 부모타입의 필드, 로컬변수, 매개변수 값으로 대입 할 수 있다.
public class CarExample {
  public static void main(String[] args) {
    // Car 객체 생성
    Car car = new Car();

    // 익명 자식 객체가 대입된 필드 사용
    car.run1();

    // 익명 자식 객체가 대입된 로컬변수 사용
    car.run2();

    // 익명 자식 객체가 대입된 매개변수 사용
    car.run3(new Tire() {
      @Override
      public void roll() {
        System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
      }
    });
  }

}

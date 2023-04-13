package ch12.sec11_reflection.exam01;

public class GetclassExample {
  // 패키지와 타입 정보 얻기
  public static void main(String[] args) throws ClassNotFoundException {
    // how1 클래스로 얻는 방법
    Class clazz1 = Car.class;

    // how2 클래스로 얻는 방법
    Class clazz2 = Class.forName("ch12.sec11_reflection.exam01.Car");

    // how3 객체로 얻는 방법
    Car car = new Car();
    Class clazz3 = car.getClass();

    System.out.println("패키지: " + clazz1.getPackage().getName());
    System.out.println("클래스 간단 이름: " + clazz1.getSimpleName());
    System.out.println("클래스 전체 이름: " + clazz1.getName());
    System.out.println("================================");
    System.out.println("패키지: " + clazz2.getPackage().getName());
    System.out.println("클래스 간단 이름: " + clazz2.getSimpleName());
    System.out.println("클래스 전체 이름: " + clazz2.getName());
    System.out.println("================================");
    System.out.println("패키지: " + clazz3.getPackage().getName());
    System.out.println("클래스 간단 이름: " + clazz3.getSimpleName());
    System.out.println("클래스 전체 이름: " + clazz3.getName());
  }
}

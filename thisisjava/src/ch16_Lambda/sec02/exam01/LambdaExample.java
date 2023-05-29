package ch16_Lambda.sec02.exam01;

public class LambdaExample {
  public static void main(String[] args) {
    Person person = new Person();

    //실행문이 두 개 이상인 경우 중괄호 필요
    person.action(()->{
      System.out.println("출근함");
      System.out.println("프로그래밍함");
    });

    //실행문 한개면 중괄호 생략가능
    person.action(()->System.out.println("퇴근함"));
  }
}

package ch16_Lambda.sec05.exam01;

public class LambdaExample {
  public static void main(String[] args) {
    Person person = new Person();
    //person.action((x,y)->Computer.staticMehod(x, y));
    person.action(Computer :: staticMehod); //(클래스명 :: 메소드명)

    Computer com = new Computer();
    person.action(com :: instanceMethod); //(참조변수명 :: 메소드명)
  }
}

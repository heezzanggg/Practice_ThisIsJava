package ch12.sec03_ObjectClass.exam03_toString;

public class ToStringExample {
  public static void main(String[] args) {
    SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

    String strObj = myPhone.toString();
    System.out.println(strObj); // toString() 메소드 호출

    System.out.println(myPhone); // toString() 메소드 호출
  }

}
// System.out.println()메소드:
// 매개값이 기본타입이거나 문자열일 경우 => 해당 값을 그대로 출력
// 매개값이 객체일 경우 => 객체의 toString()메소드를 호출해서 리턴값을 출력

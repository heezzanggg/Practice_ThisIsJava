package ch12_JavaBaseModule.sec06_wrapperClass;

import lombok.val;

public class BoxingUnBoxingExamlple {
  public static void main(String[] args) {
    // Boxing
    Integer obj = 100;
    System.out.println("vlaue: " + obj.intValue());

    // UnBoxing
    int value = obj;
    System.out.println("value: " + value);

    // 연산시 Unboxing (언박싱 후, 연산 진행)
    int result = obj + 100;
    System.out.println("result: " + result);
  }
}

// wrapper 객체 : 기본타입(byte,short,int,long,float,double,boolean,char)의 값을 갖는 객체
// boxing : 기본타입 값 -> 포장객체
// unboxing : 포장객체 -> 기본타입 값
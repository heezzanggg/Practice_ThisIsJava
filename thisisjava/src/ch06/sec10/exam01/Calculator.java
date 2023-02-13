package ch06.sec10.exam01;

public class Calculator {

    //정적필드 선언 static 타입 필드 [=초기값];
    static double pi =3.14159;

    //정적메소드 선언 static 리턴타입 메소드(매개변수,...){}
    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
}

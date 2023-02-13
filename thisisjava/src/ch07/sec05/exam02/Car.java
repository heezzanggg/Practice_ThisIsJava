package ch07.sec05.exam02;

//메소드 선언시 final 키워드를 붙이면 이 메소드는 최종적인 메소드가 되므로 오버라이딩 불가
// 부모클래스 상속해서 자식 클래스 선언 할 때, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 오버라이딩 불가
public class Car {
    //필드선언
    public int speed;

    //메소드 선언
    public void speedUp(){
        speed += 1;
    }

    //final 메소드
    public final void stop(){
        System.out.println("차 멈춤");
        speed = 0;
    }
}

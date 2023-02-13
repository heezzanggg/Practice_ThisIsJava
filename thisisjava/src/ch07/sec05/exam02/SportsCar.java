package ch07.sec05.exam02;

//메소드 선언시 final 키워드를 붙이면 이 메소드는 최종적인 메소드가 되므로 오버라이딩 불가
// 부모클래스 상속해서 자식 클래스 선언 할 때, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 오버라이딩 불가
public class SportsCar extends Car {
    @Override
    public void speedUp(){
        speed += 10;
    }

    //부모클래스의 stop()메소드는 fianl이므로 오바라이딩 불가
//    @Override
//    public void stop(){
//        System.out.println("스포츠카 멈춤");
//        speed = 0;
//    }
}

package ch07_Inheritance.sec10.exam02;

//추상메소드:일반 메소드 선언과의 차이점은 abstract 키워드 붙고, 메소드 실행 내용인 중괄호 없음
//추상메소드는 자식 클래스에서 반드시 재정의 해서 실행 내용을 채워야함
public abstract class Animal {
    // 메소드 선언
    public void breathe() {
        System.out.println("숨을 쉰다");
    }

    // 추상메소드 선언
    public abstract void sound();
}

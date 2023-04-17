package ch08_Interface.sec03;

//상수필드(public static final)를 멤버로 가질 수 있음
//인터페이스에 선언된 필드는 모두 public static final 특성을 가짐
//따라서 public static final 생략해도 자동적으로 컴파일 과정에서 붙는다.
public interface RemoteControl {
    // 상수선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}

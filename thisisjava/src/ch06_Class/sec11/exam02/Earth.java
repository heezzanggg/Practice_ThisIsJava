package ch06_Class.sec11.exam02;

public class Earth {
    // 상수선언 static final 타입 상수 [=초기값];
    // 초기값은 선언 시 주는것이 일반적이지만 정적블록에서도 초기화 가능
    // static final 타입 상수; //=>상수 선언시 초기값 선언
    // static{상수=초기값;} //=>정적블록에서 초기화
    // 상수이름은 모두 대문자로 작성, 다른 단어가 혼합 된 이름이면 언더바로 단어 연결

    // 상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    // 상수선언
    static final double EARTH_SURFACE_AREA;

    // 정적블럭에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}

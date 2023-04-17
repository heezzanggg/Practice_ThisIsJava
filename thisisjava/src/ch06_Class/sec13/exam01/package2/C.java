package ch06_Class.sec13.exam01.package2;

import ch06_Class.sec13.exam01.package1.*;

public class C {
    // 필드선언
    // A a; //A클래스 접근 불가 (why? A클래스 접근제한 default 사용. 따라서 패키지가 다르면 접근 불가)
    B b; // Class B 는 접근제한자 public 이므로 제한범위 없음!
}

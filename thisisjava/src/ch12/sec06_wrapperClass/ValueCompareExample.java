package ch12.sec06_wrapperClass;

public class ValueCompareExample {
  public static void main(String[] args) {
    // -128 ~ 127 초과값일 경우
    Integer obj1 = 300;
    Integer obj2 = 300;
    System.out.println("==: " + (obj1 == obj2)); // false
    System.out.println("equals(): " + obj1.equals(obj2)); // true
    System.out.println();

    // -128 ~ 127 범위 값 일 경우
    Integer obj3 = 10;
    Integer obj4 = 10;
    System.out.println("==: " + (obj3 == obj4)); // true
    System.out.println("equals(): " + obj3.equals(obj4)); // true
  }
}

// 포장클래스의 equals() 메소드 : 내부 값 비교할 수 있도록 재정의 됨
// 포장객체 내부 값 비교 시 '==' 와 '!=' 연산자 사용 불가 ('==' 와 '!='는 포장 객체의 번지를 비교하기 때문)
// 하지만 boolean(true,false) , char(\u0000~\u007f), byte(-128 ~ 127),short(-128 ~
// 127),int(-128 ~ 127)의 경우는 '==','!='연산자로 비교 가능
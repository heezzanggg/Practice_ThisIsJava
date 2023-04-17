package ch12_JavaBaseModule.sec03_ObjectClass.exam01_equals;

public class EqualsExample {
  public static void main(String[] args) {
    Member obj1 = new Member("blue");
    Member obj2 = new Member("blue");
    Member obj3 = new Member("red");

    if (obj1.equals(obj2)) {
      System.out.println("obj1, obj2 동등");
    } else {
      System.out.println("obj1,obj2 동등하지 않음");
    }

    if (obj1.equals(obj3)) {
      System.out.println("obj,obj3동등");
    } else {
      System.out.println("obj1,obj3 동등 x");
    }
  }

  // equals() 메소드 : 비교 연산자인 ==과 동일한 결과를 리턴.
  // 두 객체가 동일한 객체라면 true 리턴, 아니면 false

  // 동등비교? 객체가 비록 달라도 내부의 데이터가 같은지를 비교하는 것
}

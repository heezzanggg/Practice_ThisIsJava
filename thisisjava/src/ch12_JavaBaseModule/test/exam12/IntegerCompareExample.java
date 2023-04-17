package ch12_JavaBaseModule.test.exam12;

public class IntegerCompareExample {
  public static void main(String[] args) {
    Integer obj1 = 100;
    Integer obj2 = 100;
    Integer obj3 = 300;
    Integer obj4 = 300;

    System.out.println(obj1 == obj2); // true
    System.out.println(obj3 == obj4); // false

    System.out.println(obj1.equals(obj2)); // 값만 비교 true
    System.out.println(obj3.equals(obj4)); // 값만 비교 true
  }
}

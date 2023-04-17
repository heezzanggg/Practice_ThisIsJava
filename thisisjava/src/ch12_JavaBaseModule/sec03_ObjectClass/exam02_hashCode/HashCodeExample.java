package ch12_JavaBaseModule.sec03_ObjectClass.exam02_hashCode;

public class HashCodeExample {
  public static void main(String[] args) {
    Student s1 = new Student(1, "홍길동");
    Student s2 = new Student(1, "홍길동");

    Student s3 = new Student(1, "김길동");

    if (s1.hashCode() == s2.hashCode()) {// 해시코드가 동일한지 검사
      if (s1.equals(s2)) {// 데이터가 동일한지 검사
        System.out.println("동등객체");
      } else {
        System.out.println("데이터가 다르므로 동등객체 아님");
      }
    } else {
      System.out.println("해시코드가 다르므로 등등객체 아님");
    }
  }
}

package ch15_Collection.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
  public static void main(String[] args) {
    // TreeSet 컬렉션 생성
    TreeSet<Person> treeSet = new TreeSet<Person>();

    // 객체저장
    treeSet.add(new Person("홍길동", 45));
    treeSet.add(new Person("김자바", 25));
    treeSet.add(new Person("박지원", 31));

    // 객체 하나씩 가져오기
    for (Person p : treeSet) {
      System.out.println(p.name + ":" + p.age);
    }
  }

}

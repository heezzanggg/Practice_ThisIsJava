package ch15_Collection.test.exam10;

import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    TreeSet<Student> treeset = new TreeSet<Student>();
    treeset.add(new Student("blue", 96));
    treeset.add(new Student("hong", 86));
    treeset.add(new Student("white", 92));

    Student student = treeset.last();
    System.out.println("최고점수 : " + student.score);
    System.out.println("최고점수를 받은 아이디 : " + student.id);
  }
}

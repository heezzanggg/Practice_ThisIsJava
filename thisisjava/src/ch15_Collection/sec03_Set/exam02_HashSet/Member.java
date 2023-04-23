package ch15_Collection.sec03_Set.exam02_HashSet;

public class Member {

  // 필드
  public String name;
  public int age;

  // 생성자
  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // hashCode재정의
  @Override
  public int hashCode() {
    return name.hashCode() + age; // name과 age값이 같으면 ehddlfgks hashCode 리턴됨
  }

  // equals재정의
  public boolean equals(Object obj) {
    if (obj instanceof Member target) {
      return target.name.equals(name) && (target.age == age);
    } else {
      return false;
    }
  } // name과 age값이 같으면 true가 리턴됨

}

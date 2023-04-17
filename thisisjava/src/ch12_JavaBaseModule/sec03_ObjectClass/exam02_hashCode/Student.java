package ch12_JavaBaseModule.sec03_ObjectClass.exam02_hashCode;

public class Student {

  private int no;
  private String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public String getName() {
    return name;
  }

  @Override
  public int hashCode() {
    int hashCode = no + name.hashCode(); // 학생 번호와 이름해시코드를 합한 새로운 해시코드 리턴하도록함(번호와 이름이 같으면 동일한 해시코드 생성됨)
    System.out.println("name.hashCode: " + name.hashCode());
    return hashCode;
  }
  // hashCode()메소드는 객체의 데이터를 기준으로 재정의해서 새로운 정수값을 리턴하도록 하는것이 일반적.
  // 객체가 다르다 할지라도 내부데이터가 동일하면 같은 정수값을 리턴하기 위함

  @Override
  public boolean equals(Object obj) {
    // Student 객체인지 확인하고, 학생번호와 이름이 같으면 true 리턴
    if (obj instanceof Student target) {
      if (no == target.getNo() && name.equals(target.getName())) {
        return true;
      }
    }
    return false;
  }
}

// 객체해시코드 ? 객체를 식별하는 정수.
// hashCode() 메소드 : 객체의 메모리번지를 이용해서 해시코드 생성하기때문에 객체마다 다른 정수값을 리턴함. 두객체가 동등한지를
// 비교하기위해 사용

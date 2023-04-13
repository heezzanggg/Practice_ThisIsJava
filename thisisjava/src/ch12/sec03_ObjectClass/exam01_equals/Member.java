package ch12.sec03_ObjectClass.exam01_equals;

public class Member {
  public String id;

  public Member(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member target) { // obj가 Member타입인지 검사하고 타입 변환 후 target변수에 대입
      System.out.println("Member타입 맞음");
      if (id.equals(target.id)) {
        return true;
      }
    }
    return false;
  }
}

// equals() 메소드 : 비교 연산자인 ==과 동일한 결과를 리턴. 두 객체가 동일한 객체라면 true 리턴, 아니면 false

// 동등비교? 객체가 달라도 내부의 데이터가 같은지를 비교하는 것

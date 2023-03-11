package ch06.test.exam15;

public class MemberService2 {

  // login()메소드
  public boolean login(String id, String password) {
    if (id == "hong" && password == "12345") {
      return true;
    } else {
      return false;
    }
  }

  // logout()메소드
  public void logout(String id) {
    System.out.println(id + "님이 로그아웃 되었습니다.");
  }

  public static void main(String[] args) {
    MemberService2 memberService2 = new MemberService2();
    boolean result = memberService2.login("hong", "12345");
    if (result) {
      System.out.println("로그인 되었습니다.");
      memberService2.logout("hong");
    } else {
      System.out.println("id또는 password가 올바르지 않습니다.");
    }
  }
}

package ch06.test.exam18;

public class ShopService2 {
  // private 접근권한을 갖는 정적 필드 선언과 초기화
  private static ShopService2 singletone = new ShopService2();

  // private 접근 권한을 갖는 생성자 선언
  private ShopService2() {
  }

  // public 접근 권한을 갖는 정적메소드 선언 =>간접적으로 객체 얻기위함
  public static ShopService2 getInstance() {
    return singletone;
  }

  public static void main(String[] args) {
    ShopService2 obj1 = ShopService2.getInstance();
    ShopService2 obj2 = ShopService2.getInstance();

    if (obj1 == obj2) {
      System.out.println("같은 ShopService 객체입니다.");
    } else {
      System.out.println("다른 ShopService 객체입니다.");
    }
  }
}

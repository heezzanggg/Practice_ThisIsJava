package ch06_Class.test.exam18;

public class ShopService {
    // 싱글톤패턴사용

    private static ShopService singleton = new ShopService();

    private ShopService() {
    }

    static ShopService getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }

}

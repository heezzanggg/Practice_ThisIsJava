package ch06_Class.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        /*
         * Singleton obj1 = new Singletone();
         * Singleton obj2 = new Singletone();
         */

        // 정적메소드 getInstance()를 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체");
        } else {
            System.out.println("다른 Singleton 객체");
        }
    }
}

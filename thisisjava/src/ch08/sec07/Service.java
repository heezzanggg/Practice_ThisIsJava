package ch08.sec07;

public interface Service {
    // 디폴트 메소드 =>구현 객체 필요
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");

        // private메소드 호출
        defaultCommon();
        // private 정적메소드 호출
        staticCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");

        // private메소드 호출
        defaultCommon();
    }

    // private 메소드 => 디폴트메소드안에서만 호출이 가능, 디폴트와 정적메소드들의 중복 코드 줄이기위해 사용함
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    // 정적(static)메소드 =>구현 객체 필요X
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");

        // private 정적메소드 호출
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");

        // private 정적메소드 호출
        staticCommon();
    }

    // private 정적(static)메소드 =>구현 객체 필요X , 디폴트메소드 & 정적메소드안에서 호출 가능
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}

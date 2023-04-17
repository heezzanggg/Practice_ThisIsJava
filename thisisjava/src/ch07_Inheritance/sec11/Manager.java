package ch07_Inheritance.sec11;

public non-sealed class Manager extends Person {
    @Override
    public void work() {
        System.out.println("생산관리 함");
    }
}

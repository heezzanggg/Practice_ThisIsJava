package ch07_Inheritance.sec11;

public final class Employee extends Person {
    @Override
    public void work() {
        System.out.println("제품생산함");
    }
}

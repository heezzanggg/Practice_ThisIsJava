package ch07_Inheritance.sec11;

public class Director extends Manager {
    @Override
    public void work() {
        System.out.println("제품기획함");
    }
}

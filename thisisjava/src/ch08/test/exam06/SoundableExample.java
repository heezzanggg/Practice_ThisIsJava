package ch08.test.exam06;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        // Soundable soundable = new Cat();
        // soundable.sound();
        printSound(new Dog());
        // Soundable soubdable = new Dog();
        // soundable.sound();
    }

}

package ch07.test.exam08;

public class SnowTireExample {
    public static void main(String[] args){
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}

//스노우타이어 굴러감
//스노우타이어 굴러감
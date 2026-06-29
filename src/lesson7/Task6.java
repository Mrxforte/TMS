package lesson7;

public class Task6 {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.fly();
        airplane.fly();
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird flaps its wings");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane turns on jet engines");
    }
}


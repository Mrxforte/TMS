package lesson7;

public class Task1 {
    static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Dog1";
        dog2.name = "Dog2";
        dog1.bark(dog1.name);
        dog2.bark(dog2.name);
    }

}

class Dog {
    String name;
    int age;

    void bark(String name) {
        System.out.println("Gaf Gaf!!!\nmy name is " + name);
    }
}
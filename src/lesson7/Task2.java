package lesson7;

public class Task2 {
    static void main(String[] args) {
        MyDog myDog1 = new MyDog("Dog1");
        MyDog myDog2 = new MyDog("Dog2", 10);
        System.out.println("=====================================");
        myDog1.infoName(myDog1.name);
        System.out.println("=====================================");
        System.out.println("=====================================");
        myDog1.infoAgeName(myDog2.name, myDog2.age);
    }
}


class MyDog {
    String name;
    int age;

    MyDog(String name) {
        this.name = name;
        this.age = 0;
    }

    MyDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void infoName(String name) {
        System.out.println("Name is : " + name);
    }

    void infoAgeName(String name, int age) {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
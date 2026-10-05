class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}
class DownCasting{

    public static void main(String[] args) {

        Animal a = new Dog();   // Upcasting

        Dog d = (Dog) a;        // Downcasting

        d.eat();
        d.bark();
    }
}
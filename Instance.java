class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class Instance {

    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Cat);
    }
}
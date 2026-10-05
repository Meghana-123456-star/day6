class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class MethodOver {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}
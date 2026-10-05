class Student {

    void display() {
        System.out.println("No details");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
        s.display("Meghana");
        s.display("Meghana", 20);
    }
}
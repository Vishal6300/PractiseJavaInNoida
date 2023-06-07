public class Animal {
    public void legs() {
        System.out.println("4 legs");
    }

    public void speak() {
        System.out.println("speaks");
    }
}

public class Dogs extends Animal {
    public void speak() {
        System.out.println("barks");
    }
}

public class Cat extends Animal {
    public void speak() {
        System.out.println("Meow Meow");
    }
}

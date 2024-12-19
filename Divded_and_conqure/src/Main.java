// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
      void eat() {
        System.out.println("This animal eats food1.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat(); // Inherited method

    }
}

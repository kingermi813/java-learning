
    // ABSTRACTION
abstract class Animal {

    // ENCAPSULATION
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Abstract method
    abstract void makeSound();
}

// INHERITANCE
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // POLYMORPHISM (Method overriding)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // POLYMORPHISM (Method overriding)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}

// MAIN CLASS
public class Main {

    public static void main(String[] args) {

        // OBJECT CREATION
        Animal dog = new Dog("Bobby");
        Animal cat = new Cat("Kitty");

        // Calling methods
        dog.makeSound();
        cat.makeSound();
    }
}


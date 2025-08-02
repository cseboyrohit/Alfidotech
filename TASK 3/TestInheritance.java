
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound(); 

        Dog d = new Dog();
        d.makeSound();

        Animal ad = new Dog();
        ad.makeSound(); // Output: Dog barks (runtime polymorphism)
    }
}

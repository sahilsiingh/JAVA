// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
} 
  
// Child class 
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal
        dog.bark(); // Method of Dog class
    }
}

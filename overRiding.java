package oopconcept;
// Example of method overriding
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
public class overRiding {
public static void main(String args[])
        {
            Animal an=new Animal();
            an.makeSound();
            Dog dog=new Dog();
            dog.makeSound();
        }    
}

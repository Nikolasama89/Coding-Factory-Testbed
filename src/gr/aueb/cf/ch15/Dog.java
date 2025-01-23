package gr.aueb.cf.ch15;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog!");
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }
}

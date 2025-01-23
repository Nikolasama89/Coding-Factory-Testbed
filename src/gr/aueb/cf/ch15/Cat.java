package gr.aueb.cf.ch15;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }

    @Override
    public void speak() {
        System.out.println("I am a cat!");
    }
}

package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {

        Dog anti = new Dog("Anti", 14);
        Cat margie = new Cat("Margie", 12);
        Animal bob = new Animal("Bob", 5);

        System.out.println(anti);
        System.out.println(margie);

//        anti.speak();
//        margie.speak();
//        bob.speak();

        doSpeak(anti);
        doSpeak(margie);
        doSpeak(bob);

    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}

package Abstraction;

/**
 * Created by diego on 19/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");

        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Australian ringneck");
        bird.eat();
        bird.eat();
        bird.fly();
    }
}

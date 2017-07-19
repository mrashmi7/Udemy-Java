package Abstraction;

/**
 * Created by diego on 19/07/2017.
 */
public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is picking\n", this.getName());
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat");
    }

    public abstract void fly();
}

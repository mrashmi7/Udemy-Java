package Abstraction;

/**
 * Created by diego on 19/07/2017.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is eathing\n",this.getName());
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

}

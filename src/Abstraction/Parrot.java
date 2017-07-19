package Abstraction;

/**
 * Created by diego on 19/07/2017.
 */
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying from branch to branch");
    }


}

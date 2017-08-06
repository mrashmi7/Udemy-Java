package Final;

/**
 * Created by diego on 01/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());


        System.out.println(Math.PI);


        Password pass = new ExtendedPassword(1231);
        pass.storePassword();


        pass.letMeIn(1231);
        pass.letMeIn(1);

    }
}

package Final;

/**
 * Created by diego on 01/08/2017.
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        this.classCounter++;
        this.instanceNumber = this.classCounter;
        System.out.printf("%s created, instance is %d\n", name, this.instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

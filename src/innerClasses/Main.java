package innerClasses;

/**
 * Created by diego on 17/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(true);

        mcLaren.changeGear(2);
        mcLaren.operateClutch(false);

        System.out.println(mcLaren.wheelSpeed(2000));

    }
}

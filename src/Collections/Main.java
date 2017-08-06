package Collections;

/**
 * Created by diego on 05/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympain", 27, 12);

        if (theatre.researveSeat("Z01")) {
            System.out.println("hey gereserveerd");
        } else {
            System.out.println("neee");
        }

        if (theatre.researveSeat("Z01")) {
            System.out.println("hey gereserveerd");
        } else {
            System.out.println("neee");
        }
    }
}

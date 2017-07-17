package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by diego on 17/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Storage samsungUsb = new USB();
        samsungUsb.addValueToMemory(readValues());
        System.out.println(samsungUsb.getValuesInMemory().toString());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Your options are: \n" +
                "1 - Quit\n" +
                "2 - Enter a string\n");

        while(!quit) {
            System.out.println("Choose your option: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Daaag");
                    quit = true;
                    break;
                case 2:
                    scanner.nextLine();
                    values.add(scanner.nextLine());
                    break;
            }
        }
        return values;

    }
}

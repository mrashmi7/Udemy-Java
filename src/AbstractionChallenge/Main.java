package AbstractionChallenge;

/**
 * Created by diego on 19/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ItemString value1 = new ItemString();
        value1.setValue("poep");
        System.out.println(value1.compare("poeasdadp"));

        String names = "Diego Walid Jochem EhMongool Zemmer Koe Beer";
//        String numbers = "1 2 9 8 7 6 4 8 7 5 3 2";

        String[] data = names.split(" ");
        Item[] namesLinkedList = new Item[data.length];
        Item previousItem = null;
        for (int i = 0; i < data.length; i++) {
            Item item = new ItemString();
            if (previousItem == null) {
                item.setValue(data[i]);
                item.setPreviousValue(new ItemString());
                item.setNextValue(new ItemString());
            }  else {
                item.setValue(data[i]);
                item.setPreviousValue(previousItem);


                item.setNextValue(new ItemString());

            }
            previousItem = item;
            namesLinkedList[i] = item;
        }
        for (Item item: namesLinkedList) {
            System.out.println("-------------------");
            System.out.println(item.getValue());
            System.out.println(item.getPreviousValue());
            System.out.println(item.getNextValue());

        }
    }


}

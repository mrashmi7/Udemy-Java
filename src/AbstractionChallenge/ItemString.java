package AbstractionChallenge;

/**
 * Created by diego on 19/07/2017.
 */
public class ItemString extends Item {

    @Override
    public int compare(Object value) {
        String firstString = this.getValue().toString();
        String secondString = value.toString();
        return firstString.compareTo(secondString);
    }
}

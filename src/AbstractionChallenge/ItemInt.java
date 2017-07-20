package AbstractionChallenge;

/**
 * Created by diego on 19/07/2017.
 */
public class ItemInt extends Item {

    @Override
    public int compare(Object value) {
        int firstInteger = (int) this.getValue();
        int secondInteger = (int) value;
        return firstInteger - secondInteger;
    }
}

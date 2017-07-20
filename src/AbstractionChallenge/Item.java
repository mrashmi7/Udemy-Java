package AbstractionChallenge;

/**
 * Created by diego on 19/07/2017.
 */
public abstract class Item {
    private Object value;
    private Item previousValue;
    private Item nextValue;

    public abstract int compare(Object value);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getPreviousValue() {
        return previousValue.getValue();
    }

    public void setPreviousValue(Item previousValue) {
        this.previousValue = previousValue;
    }

    public Object getNextValue() {
        return nextValue.getValue();
    }

    public void setNextValue(Item nextValue) {
        this.nextValue = nextValue;
    }
}

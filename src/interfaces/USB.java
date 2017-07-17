package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 17/07/2017.
 */
public class USB extends ArrayList implements Storage {

    @Override
    public boolean addValueToMemory(ArrayList values) {
        this.addAll(values);
        return true;
    }

    @Override
    public List getValuesInMemory() {
        return null;
    }
}

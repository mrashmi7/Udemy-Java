package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 17/07/2017.
 */
public interface Storage {
    public boolean addValueToMemory(ArrayList values);
    public List getValuesInMemory();
}

import java.util.ArrayList;

/**
 * Created by diego on 09/07/2017.
 */
public class ContactList extends ArrayList<Contact> {

    @Override
    public int indexOf(Object o) {
        System.out.println(o);
        return super.indexOf(o);
    }
}

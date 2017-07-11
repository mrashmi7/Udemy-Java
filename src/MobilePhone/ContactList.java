package MobilePhone;

import MobilePhone.MobilePhone;

import java.util.ArrayList;

/**
 * Created by diego on 09/07/2017.
 */
public class ContactList extends ArrayList<Contact> {

    @Override
    public int indexOf(Object searchValue) {
        for (int i = 0; i < this.size() ; i++)
            if (searchValue.equals(this.get(i).getName()) ||  searchValue.equals(this.get(i).getPhoneNumber()))
                return i;
        return -1;
    }

}

package Autoboxing;

import java.util.ArrayList;

/**
 * Created by diego on 11/07/2017.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
}

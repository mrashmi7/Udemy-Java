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

    public void addNewCustomer(String name, double initialTransaction) {
        this.customerList.add(new Customer(name, initialTransaction));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}

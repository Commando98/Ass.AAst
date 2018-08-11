package caftria;

import java.util.ArrayList;

public class Cafeteria {

    private String name;
    private ArrayList <Employee> employees;
    private ArrayList <Customer> customers;
    private ArrayList <Product> products;

    public Cafeteria(){

    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void addEmployee(Employee employee){

        employees.add(employee);
    }

   // To implement
    public Employee getEmployee(){
        return null;
}

    public void addCustomer(Customer customer){

        customers.add(customer);
    }

    public void sell(Customer customer,Product product,int quantity){
        customer.addInvoice();
    }
}

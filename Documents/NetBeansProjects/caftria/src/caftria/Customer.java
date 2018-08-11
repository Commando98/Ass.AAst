package caftria;

import java.util.Map;
import java.util.LinkedHashMap;

public class Customer extends Person {

    private String title;
    private Map <String,Invoice> invoices= new LinkedHashMap();


    public void setTitle(String title){

        this.title = title;
    }


    public void addInvoice(Invoice invoice){
        //To implement: Check the key
    //don't know what is this ask    invoices.put(String.toString(Math.random()),invoice);
    }

    void addInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

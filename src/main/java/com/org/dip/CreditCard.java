package com.org.dip;

public class CreditCard implements IPayment {

    @Override
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}

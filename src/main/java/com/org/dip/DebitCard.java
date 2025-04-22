package com.org.dip;

public class DebitCard implements IPayment {



    @Override
    public void doTransaction(int amount) {
        System.out.println("tx done with DebitCard");
        System.out.println("Amount: " + amount);
    }
}

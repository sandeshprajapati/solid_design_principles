package com.org.isp;

public class ABCPay implements CashbackPayment {

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Cashback received");
    }
}

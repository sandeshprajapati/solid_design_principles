package com.org.isp;

public class GPay implements UPIPayments, CashbackPayment {
    @Override
    public void payMoney() {
        System.out.println("tx done with GPay");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Scratch card received");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Cashback received");
    }
}

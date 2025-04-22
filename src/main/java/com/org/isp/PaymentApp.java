package com.org.isp;

public class PaymentApp {
    public static void main(String[] args) {
        GPay gPay = new GPay();
        gPay.payMoney();
        gPay.getScratchCard();
        gPay.getCashBackAsCreditBalance();
        System.out.println("===================================");
        ABCPay abcPay = new ABCPay();
        abcPay.getCashBackAsCreditBalance();
        System.out.println("===================================");
    }
}

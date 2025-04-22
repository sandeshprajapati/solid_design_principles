package com.org.dip;

public class TicketBookingApp {

    private IPayment paymentMethod;

    public TicketBookingApp(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public static void main(String[] args) {
        // Use DebitCard for payment
        IPayment debitCard = new DebitCard();
        TicketBookingApp ticketApp = new TicketBookingApp(debitCard);
        ticketApp.doPayment(4, 5000);

        // Use CreditCard for payment
        IPayment creditCard = new CreditCard();
        TicketBookingApp ticketAppWithCredit = new TicketBookingApp(creditCard);
        ticketAppWithCredit.doPayment(2, 3000);
    }

    public void doPayment(int noOfTickets, int amount) {
        System.out.println("Payment for " + noOfTickets + " tickets.");
        paymentMethod.doTransaction(amount);
    }
}
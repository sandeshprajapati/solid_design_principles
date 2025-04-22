package com.org.srp;

public class TicketBookingService {
    public String bookTicket(int numberOfSeats) {
        // booking the ticket
        System.out.println("Booking " + numberOfSeats + " tickets");
        return "Ticket Booked";
    }

    public void printTickect() {
        // printing the Ticket
        System.out.println("Printing ticket");
    }
}

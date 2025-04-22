package com.org.srp;

import com.org.ocp.NotificationService;

public class ReservationService {

    private final BusSearchService busSearchService;
    private final TicketBookingService ticketBookingService;
    private final NotificationService notificationService;
    private final InsuranceService insuranceService;
    private final PrintingService printingService;

    private ReservationService() {
        this.busSearchService = new BusSearchService();
        this.ticketBookingService = new TicketBookingService();
        this.notificationService = new NotificationService();
        this.insuranceService = new InsuranceService();
        this.printingService = new PrintingService();
    }

    public static void main(String[] args) {
        ReservationService reservationService = new ReservationService();

        reservationService.reserveTicket("New York", "Los Angeles", 2);
    }

    public void reserveTicket(String source, String destination, int numberOfSeats) {
        String searchResult = busSearchService.search(source, destination);
        System.out.println(searchResult);

        String ticket = ticketBookingService.bookTicket(numberOfSeats);
        System.out.println(ticket);
        notificationService.sendNotification("email");
        insuranceService.getTravelInsuranceInfo(12345);
        printingService.printTicket(ticket);
    }
}

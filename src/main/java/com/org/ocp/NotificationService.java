package com.org.ocp;

public class NotificationService {

    INotification notificationService;

    public void sendNotification(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            notificationService = new EmailNotificationService();
            notificationService.sendOTP("sk@mail.com");
        } else if (medium.equalsIgnoreCase("sms")) {
            notificationService = new SMSNotificationService();
            notificationService.sendOTP("1234567890");
        } else if (medium.equalsIgnoreCase("whatsapp")) {
            notificationService = new WhatsAppNotificationService();
            notificationService.sendOTP("1234567890");
        } else {
            System.out.println("Invalid medium");
            return;
        }

    }
}

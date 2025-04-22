package com.org.ocp;

public class NotificationFactory {
    /**
     * Factory method to get the appropriate notification service based on the type.
     *
     * @param type The type of notification service (e.g., "email", "sms", "whatsapp").
     * @return An instance of INotification corresponding to the specified type.
     */
    public static INotification getNotificationService(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotificationService();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotificationService();
        } else if (type.equalsIgnoreCase("whatsapp")) {
            return new WhatsAppNotificationService();
        }
        return null;
    }
}

package com.org.ocp;

public class WhatsAppNotificationService implements INotification{
    @Override
    public void sendOTP(String to) {
        System.out.println("Sending OTP via WhatsApp to: " + to);
    }
}

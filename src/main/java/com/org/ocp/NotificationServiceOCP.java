package com.org.ocp;

public class NotificationServiceOCP {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related logic
            System.out.println("Sending OTP via email");
        } else if (medium.equals("sms")) {
            // write sms related logic
            System.out.println("Sending OTP via SMS");
        }
    }
}

package com.org.srp;

public class NotificationService {
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

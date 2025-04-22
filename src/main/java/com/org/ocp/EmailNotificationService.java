package com.org.ocp;

public class EmailNotificationService implements INotification{
    @Override
    public void sendOTP(String emailId) {
        System.out.println("Sending OTP via email to: " + emailId);
    }
}

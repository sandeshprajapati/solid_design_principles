package com.org.ocp;

public class SMSNotificationService implements INotification{
    @Override
    public void sendOTP(String mobileNumber) {
        System.out.println("Sending OTP via SMS to: " + mobileNumber);

    }
}

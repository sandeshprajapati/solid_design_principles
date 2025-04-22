package com.org.lsp.solution;

public class SmartPhone implements Callable,
        SMSCapable, MusicPlayer, VideoPlayer {

    @Override
    public void call() {
        System.out.println("Making a call...");
    }

    @Override
    public void sendSMS(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing music: " + fileName);
    }

    @Override
    public void playVideo(String videoFileName) {
        System.out.println("Playing video: " + videoFileName);
    }
}

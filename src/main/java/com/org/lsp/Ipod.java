package com.org.lsp;

public class Ipod extends Mobile {

    @Override
    public void sendSMS() {
        // not applicable
    }

    @Override
    public void call() {
        // nota applicable

    }

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing music " + fileName);

    }

    @Override
    public void playVideo(String videoFileName) {
        // not applicable
    }

}

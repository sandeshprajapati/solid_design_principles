package com.org.lsp.solution;

public class Ipod implements MusicPlayer {
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing music: " + fileName);
    }
}

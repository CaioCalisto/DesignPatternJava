package adapter.example;

import adapter.example.medias.AdvancedAdapter;
import adapter.example.medias.advanceds.Advanced;
import adapter.example.medias.advanceds.MP4;
import adapter.example.medias.simples.Diskman;
import adapter.example.medias.simples.Simple;

public class Main {

    public static void main(String[] args) {
        Advanced mp4 = new MP4();
        
        Jukebox jukebox = new Jukebox(mp4);
        jukebox.PlayTheMedia();

        // HERE I AM GOING TO ADAPT SIMPLE IN ADVANCED
        Simple diskman = new Diskman();
        Advanced advancedAdapter = new AdvancedAdapter(diskman);
        jukebox = new Jukebox(advancedAdapter);
        jukebox.PlayTheMedia();
    }
}

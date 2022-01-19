package adapter.example;

import adapter.example.medias.advanceds.Advanced;

public class Jukebox {
    private Advanced advancedMedia;

    public Jukebox(Advanced advanced) {
        advancedMedia = advanced;
    }

    public void PlayTheMedia() {
        advancedMedia.Play();
    }
}

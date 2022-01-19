package adapter.example.medias;

import adapter.example.medias.advanceds.Advanced;
import adapter.example.medias.simples.Simple;

public class AdvancedAdapter implements Advanced {
    private Simple simpleMedia;

    public AdvancedAdapter(Simple simple){
        simpleMedia = simple;
    }

    @Override
    public void Play() {
        System.out.println("Playing from adapter");
        simpleMedia.JustPlay();
    }
}

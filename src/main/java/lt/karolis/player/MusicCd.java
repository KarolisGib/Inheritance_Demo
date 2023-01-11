package lt.karolis.player;

public class MusicCd implements Multimedia{
    private String artist;

    public MusicCd(String name) {
        this.artist = name;
    }

    @Override
    public void play() {
        System.out.println("Music cd is playing: " + this.artist);
    }

//    public void play() {
//        System.out.println("Music cd is playing: " + this.artist);
//    }
}

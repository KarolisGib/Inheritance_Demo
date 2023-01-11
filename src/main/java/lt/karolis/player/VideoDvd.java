package lt.karolis.player;

public class VideoDvd implements Multimedia {

    private String movie;

    public VideoDvd(String name) {
        this.movie = name;
    }

    @Override
    public void play() {
        System.out.println("Video dvd is playing: " + this.movie);
    }

//    public void play() {
//        System.out.println("Video dvd is playing: " + this.movie);
//    }
}

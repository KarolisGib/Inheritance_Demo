package lt.karolis.player;

public class VideoBlueRay implements Multimedia {
    private String movieBlueRay;

    public VideoBlueRay(String name) {
        this.movieBlueRay = name;
    }

    @Override
    public void play() {
        System.out.println("Video BlueRay is playing: " + this.movieBlueRay);
    }
}

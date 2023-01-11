package lt.karolis.player;

public class MainPlayer {
    public static void main(String[] args) {

        Player player = new Player();

        MusicCd musicCd01 = new MusicCd("Rammstein" );
        MusicCd musicCd02 = new MusicCd("Metallica" );
        MusicCd musicCd03 = new MusicCd("G&G Sindikatass" );

        player.run(musicCd01);
        player.run(musicCd02);
        player.run(musicCd03);

        System.out.println();

        VideoDvd videoDvd01 = new VideoDvd("Avataras" );
        VideoDvd videoDvd02 = new VideoDvd("TOP GUN" );
        VideoDvd videoDvd03 = new VideoDvd("Haris Poteris" );

        player.run(videoDvd01);
        player.run(videoDvd02);
        player.run(videoDvd03);

        System.out.println();

        VideoBlueRay videoBlueRay01 = new VideoBlueRay("Ziedu valdovas:1" );
        VideoBlueRay videoBlueRay02 = new VideoBlueRay("Ziedu valdovas:2" );
        VideoBlueRay videoBlueRay03 = new VideoBlueRay("Ziedu valdovas:3" );

        player.run(videoBlueRay01);
        player.run(videoBlueRay02);
        player.run(videoBlueRay03);
    }
}

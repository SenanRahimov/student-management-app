package Task9;

public class Main {
    public static void main(String[] args) {
//        Playable musicPlayer = new MusicPlayer();
//        Playable videoPlayer = new VideoPlayer();
//        musicPlayer.play();
//        musicPlayer.stop();
//
//        videoPlayer.play();
//        videoPlayer.stop();

        AdvancedPlayable player = new Player();
        player.pause();
        player.play();
        player.stop();


    }
}

package Task9;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Video is now playing.");
    }

    @Override
    public void stop() {
        System.out.println("Video has stopped.");
    }
}

package Task9;

public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is now playing.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");

    }
}

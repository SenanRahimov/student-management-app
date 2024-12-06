package Task9;

public class Player implements AdvancedPlayable{
    @Override
    public void pause() {
        System.out.println( "Music has been paused");

    }

    @Override
    public void play() {
        System.out.println("Music is now playing.");

    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");

    }
}

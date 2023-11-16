import java.util.function.Consumer;

public class PopMusic implements MusicStyles{

    String name;

    public PopMusic(String name) {
        this.name = name;
    }

    @Override
    public Consumer<? super String> playMusic() {
        System.out.println( "play PopMusic " + name);
        return null;
    }
}

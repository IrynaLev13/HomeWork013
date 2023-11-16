import java.util.function.Consumer;

public class RockMusic implements MusicStyles{

    String name;

    public RockMusic(String name) {
        this.name = name;
    }

    @Override
    public Consumer<? super String> playMusic() {
        System.out.println("Play RockMusic " + name);
        return null;
    }
}

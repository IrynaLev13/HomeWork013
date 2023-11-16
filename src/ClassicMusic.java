import java.util.function.Consumer;

public class ClassicMusic implements MusicStyles {

    String name;


    public ClassicMusic(String name) {
        this.name = name;
    }

    @Override
    public Consumer<? super String> playMusic() {
        System.out.println("Play ClassicMusic " + name);
        return null;
    }
}

import java.util.Arrays;
import java.util.stream.Stream;

public class HW023 {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {new PopMusic("Тест"), new RockMusic("Metal"), new ClassicMusic("Classik")};

        for (MusicStyles styles : musicStyles) {
            styles.playMusic();

        }


    }
}

























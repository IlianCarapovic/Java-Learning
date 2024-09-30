import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pacage> list = List.of(
            new Pacage(2,2,2,"Red"),
            new Pacage(2,2,2,"Red"),
            new Pacage(2,2,2,"Red"),
            new Pacage(2,2,2,"blue"),
            new Pacage(2,2,2,"blue"),
            new Pacage(2,2,2,"Red"),
            new Pacage(2,2,2,"blue")
        );
        System.out.println(list);

        IVolume volume = new PacageRepository(list);
        System.out.println(volume.getVolume());

        IColorFilter colorFilter = new PacageRepository(list);
        System.out.println(colorFilter.GetRed());
        System.out.println(colorFilter.GetBlue());

    }
}

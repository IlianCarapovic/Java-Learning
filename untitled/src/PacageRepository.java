import lombok.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PacageRepository implements IVolume, IColorFilter  {

    List<Pacage> pacages;

    @Override
    public double getVolume() {
        return pacages.stream().mapToDouble(Pacage::getVolume).sum();
    }

    @Override
    public List<Pacage> GetBlue() {
        return pacages.stream().filter(pacage -> pacage.color.equalsIgnoreCase("Blue")).collect(Collectors.toList());
    }

    @Override
    public List<Pacage> GetRed() {
        return pacages.stream().filter(pacage -> pacage.color.equalsIgnoreCase("Red")).collect(Collectors.toList());
    }
}

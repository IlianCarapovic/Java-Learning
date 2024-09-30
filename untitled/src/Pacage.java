import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pacage implements IVolume{
    double height;
    double width;
    double depth;
    String color;

    @Override
    public double getVolume() {
        return height * width * depth;
    }
}

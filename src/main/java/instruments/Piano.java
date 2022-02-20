package instruments;

public class Piano extends Instruments{

    public Piano(String material, String color, String type) {
        super(material, color, type);
    }

    @Override
    public String play() {
        return null;
    }
}

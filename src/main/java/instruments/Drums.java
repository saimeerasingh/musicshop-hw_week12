package instruments;

import behaviours.IPlay;

public class Drums extends Instruments {
    public Drums(String material, String color, String type) {
        super(material, color, type);
    }

    @Override
    public String play() {
        return null;
    }
}

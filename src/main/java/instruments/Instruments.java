package instruments;

import behaviours.IPlay;

public abstract class Instruments implements IPlay {

    private String material;
    private String color;
    private String type;

    public Instruments(String material, String color, String type) {
        this.material = material;
        this.color = color;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}

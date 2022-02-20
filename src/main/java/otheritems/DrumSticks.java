package otheritems;

public class DrumSticks extends OtherItem {

    public DrumSticks(String type) {
        super(type);
    }

    @Override
    public int buyingPrice() {
        return 0;
    }

    @Override
    public int sellingPrice() {
        return 0;
    }
}

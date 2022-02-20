package otheritems;

public class SheetMusic extends OtherItem{


    public SheetMusic(String type) {
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

package otheritems;

import behaviours.ISell;

public abstract class OtherItem implements ISell {

    private String type;

    public OtherItem(String type) {
        this.type = type;
    }
}

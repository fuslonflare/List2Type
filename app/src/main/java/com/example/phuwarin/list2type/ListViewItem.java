package com.example.phuwarin.list2type;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class ListViewItem {
    private String text;
    private String addressPic;
    private int type;

    public ListViewItem(String addressPic, String text, int type) {
        this.addressPic = addressPic;
        this.text = text;
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddressPic() {
        return addressPic;
    }

    public void setAddressPic(String addressPic) {
        this.addressPic = addressPic;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public int getType() {
        return type;
    }


}

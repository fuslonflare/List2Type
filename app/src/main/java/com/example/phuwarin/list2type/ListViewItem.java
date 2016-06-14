package com.example.phuwarin.list2type;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class ListViewItem {
    public static final int TYPE_TOPIC = 0;
    public static final int TYPE_DESCRIPTION = 1;

    private String data;
    private String url;
    private int type;

    public ListViewItem(String data, int type, String url) {
        this.data = data;
        this.type = type;
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}

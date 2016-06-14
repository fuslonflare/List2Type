package com.example.phuwarin.list2type;

import android.widget.TextView;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class ViewHolder {
    TextView textView;

    public ViewHolder(TextView textView) {
        this.textView = textView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}

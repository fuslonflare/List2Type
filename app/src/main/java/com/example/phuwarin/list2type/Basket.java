package com.example.phuwarin.list2type;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Phuwarin on 6/10/2016.
 */
public class Basket extends BaseAdapter {

    private String[] categoryText;
    private int[] detailLayout;
    private Context myContext;

    @Override
    public int getCount() {
        return categoryText.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.activity_basket, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.basket_tw);
        textView.setText(categoryText[position]);

        View layout = convertView.findViewById(R.id.layout_detail);
        layout.set
        return convertView;
    }
}

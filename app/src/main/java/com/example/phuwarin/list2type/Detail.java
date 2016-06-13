package com.example.phuwarin.list2type;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Detail extends BaseAdapter {

    private String[] textList;
    private int[] imageList;
    private Context myContext;

    public Detail(Context contexts, String[] textList, int[] imageList) {
        this.myContext = contexts;
        this.textList = textList;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return textList.length;
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
            convertView = layoutInflater.inflate(R.layout.activity_detail, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(textList[position]);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        Picasso.with(myContext).load(imageList[position]);

        return convertView;
    }
}

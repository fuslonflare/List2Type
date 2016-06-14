package com.example.phuwarin.list2type;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class CustomAdapter extends BaseAdapter {

    public static final int TYPE_TOPIC = 0;
    public static final int TYPE_DETAIL = 1;

    private ListViewItem[] object;

    public CustomAdapter(Context contexts, ListViewItem[] object) {
        this.object = object;
    }

    @Override
    public int getItemViewType(int position) {
        return object[position].getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return object.length;
    }

    @Override
    public Object getItem(int position) {
        return object[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        ListViewItem listViewItem = object[position];
        int listViewItemType = getItemViewType(position);

//        if (convertView == null) {
//            switch (listViewItemType) {
//                case TYPE_TOPIC:
//                    LayoutInflater.from(getContext()).inflate(R.layout.activity_basket, null);
//                    break;
//                case TYPE_DETAIL:
//                    LayoutInflater.from(getContext()).inflate(R.layout.activity_detail, null);
//                    break;
//                default:
//                    break;
//            }
//        }
//        if (listViewItemType == 0) {
//            TextView textView = (TextView) convertView.findViewById(R.id.basket_tw);
//            textView.setText();
//        }
        return convertView;
    }


}

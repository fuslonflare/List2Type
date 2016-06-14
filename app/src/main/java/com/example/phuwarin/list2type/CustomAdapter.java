package com.example.phuwarin.list2type;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private List<ListViewItem> items;
    private Context context;

    public CustomAdapter(Context contexts, List<ListViewItem> object) {
        this.context = contexts;
        this.items = new ArrayList<>(object);
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ListViewItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewItem listViewItem = (ListViewItem) getItem(position);
        int listViewItemType = getItemViewType(position);
        switch (listViewItemType) {
            case ListViewItem.TYPE_TOPIC:
                convertView = inflateTopic(convertView, parent, listViewItem);
                break;
            case ListViewItem.TYPE_DESCRIPTION:
                convertView = inflateDescrip(convertView, parent, listViewItem);
                break;
            default:
                break;
        }
        return convertView;
    }

    private View inflateTopic(View convertView, ViewGroup parent, ListViewItem item) {
        topicHolder topicHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_basket, parent, false);
            topicHolder = new topicHolder(convertView);
            convertView.setTag(topicHolder);
        } else {
            topicHolder = (CustomAdapter.topicHolder) convertView.getTag();
        }

        topicHolder.textView.setText(item.getData());
        return convertView;
    }

    private View inflateDescrip(View convertView, ViewGroup parent, ListViewItem item) {
        descripHolder descripHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_detail, parent, false);
            descripHolder = new descripHolder(convertView);
            convertView.setTag(descripHolder);
        } else {
            descripHolder = (CustomAdapter.descripHolder) convertView.getTag();
        }

        descripHolder.textView.setText(item.getData());
        Picasso.with(context).load(item.getUrl()).into(descripHolder.imageView);
        return convertView;
    }

    static class topicHolder {
        private TextView textView;

        public topicHolder(View convertView) {
            this.textView = (TextView) convertView.findViewById(R.id.basket_tw);
        }
    }

    static class descripHolder {
        private TextView textView;
        private ImageView imageView;

        public descripHolder(View convertView) {
            this.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            this.textView = (TextView) convertView.findViewById(R.id.textView);
        }
    }
}

package com.example.phuwarin.list2type;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CharSequence[] type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        List<ListViewItem> item = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            item.add(new ListViewItem(Storage.listTopic[i], ListViewItem.TYPE_TOPIC, ""));
            for (int j = 0; j < 3; ++j) {
                item.add(new ListViewItem(Storage.listItem[i][j], ListViewItem.TYPE_DESCRIPTION, Storage.listPhoto[i][j]));
            }
        }
        CustomAdapter customAdapter = new CustomAdapter(this, item);
        listView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_jumpTo:
                jumpTo();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void jumpTo() {
        type = Storage.getListTopic();

        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Jump to..");
        builder.setItems(type, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                listView.setSelectionFromTop(whereRU(which), 0);
            }
        });
        Dialog dialog = builder.create();
        dialog.show();
    }

    private int whereRU(int selectItem) throws ArrayIndexOutOfBoundsException {
        int index = -1;
        for (int i = 0; i < type.length; ++i) {
            if (type[i].equals(type[selectItem])) {
                index = i;
                break;
            }
        }
        return index;
    }
}

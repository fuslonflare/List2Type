package com.example.phuwarin.list2type;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        final ListViewItem[] topic;
        final ListViewItem[] detail;

//        topic[]
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
//        type = new CharSequence[]{"ช้าง", "จักจั่น", "ตั๊กแตน", "หิ่งห้อย"};
//
//        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Jump to..");
//        builder.setItems(type, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                listView.setSelectionFromTop(whereRU(which), 0);
//            }
//        });
//        Dialog dialog = builder.create();
//        dialog.show();
    }

    private int whereRU(int selectItem) {
//        int index = -1;
//        for (int i = 0; i < text.length; ++i) {
//            if (text[i].equals(type[selectItem])) {
//                index = i;
//                break;
//            }
//        }
        return 0;
    }
}

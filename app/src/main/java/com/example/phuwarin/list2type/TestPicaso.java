package com.example.phuwarin.list2type;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

/**
 * Created by Phuwarin on 6/13/2016.
 */
public class TestPicaso extends AppCompatActivity {
    String link = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Grosser_Panda.JPG/1200px-Grosser_Panda.JPG";
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Log.d("MyTAG", "onCreate");

        imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(getApplicationContext()).load(link).into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                Log.d("MyTAG", "onSuccess");
            }

            @Override
            public void onError() {
                Log.d("MyTAG", "onError");
            }
        });

    }
}

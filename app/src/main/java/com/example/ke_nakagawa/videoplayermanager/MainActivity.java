package com.example.ke_nakagawa.videoplayermanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.list_view: {
                intent = new Intent(this, VideoListViewActivity.class);
            }
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}

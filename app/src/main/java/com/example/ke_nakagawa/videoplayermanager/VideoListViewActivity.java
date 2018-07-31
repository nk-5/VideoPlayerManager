package com.example.ke_nakagawa.videoplayermanager;

import android.content.res.AssetFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.video_player_manager.manager.PlayerItemChangeListener;
import com.example.video_player_manager.manager.SingleVideoPlayerManager;
import com.example.video_player_manager.manager.VideoPlayerManager;
import com.example.video_player_manager.meta.MetaData;
import com.example.video_player_manager.utils.Logger;

public class VideoListViewActivity extends AppCompatActivity {

    private final VideoPlayerManager<MetaData> mVideoPlayerManager = new SingleVideoPlayerManager(new PlayerItemChangeListener() {
        @Override
        public void onPlayerItemChanged(MetaData metaData) {
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list_view);


        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new VideoAdapter(mVideoPlayerManager, this));
    }
}

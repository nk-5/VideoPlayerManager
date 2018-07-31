package com.example.video_player_manager.manager;

import android.content.res.AssetFileDescriptor;

import com.example.video_player_manager.meta.MetaData;
import com.example.video_player_manager.ui.VideoPlayerView;

public interface VideoPlayerManager <T extends MetaData> {

    void playNewVideo(T metaData, VideoPlayerView videoPlayerView, String videoUrl);

    void playNewVideo(T metaData, VideoPlayerView videoPlayerView, AssetFileDescriptor assetFileDescriptor);

    void stopAnyPlayback();

    void resetMediaPlayer();
}

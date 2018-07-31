package com.example.video_player_manager.player_messages;

import android.content.res.AssetFileDescriptor;

import com.example.video_player_manager.manager.VideoPlayerManagerCallback;
import com.example.video_player_manager.ui.VideoPlayerView;

public class SetAssetsDataSourceMessage extends SetDataSourceMessage {

    private final AssetFileDescriptor mAssetFileDescriptor;

    public SetAssetsDataSourceMessage(VideoPlayerView videoPlayerView,
            VideoPlayerManagerCallback callback,
            AssetFileDescriptor assetFileDescriptor) {
        super(videoPlayerView, callback);
        mAssetFileDescriptor = assetFileDescriptor;
    }

    @Override
    protected void performAction(VideoPlayerView currentPlayer) {
        currentPlayer.setDataSource(mAssetFileDescriptor);
    }
}

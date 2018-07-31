package com.example.video_player_manager.player_messages;

import com.example.video_player_manager.manager.VideoPlayerManagerCallback;
import com.example.video_player_manager.ui.VideoPlayerView;

public class SetUrlDataSourceMessage extends SetDataSourceMessage {

    private final String mVideoUrl;

    public SetUrlDataSourceMessage(VideoPlayerView videoPlayerView,
            VideoPlayerManagerCallback callback,
            String videoUrl) {
        super(videoPlayerView, callback);
        mVideoUrl = videoUrl;
    }

    @Override
    protected void performAction(VideoPlayerView currentPlayer) {
        currentPlayer.setDataSource(mVideoUrl);
    }
}

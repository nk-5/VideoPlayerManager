package com.example.video_player_manager.manager;

import com.example.video_player_manager.PlayerMessageState;
import com.example.video_player_manager.meta.MetaData;
import com.example.video_player_manager.player_messages.PlayerMessage;
import com.example.video_player_manager.ui.VideoPlayerView;

public interface VideoPlayerManagerCallback {

    void setCurrentItem(MetaData currentItemMetaData, VideoPlayerView newPlayerView);

    void setVideoPlayerState(VideoPlayerView videoPlayerView, PlayerMessageState playerMessageState);

    PlayerMessageState getCurrentPlayerState();
}

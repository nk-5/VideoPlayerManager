package com.example.video_player_manager.player_messages;

import com.example.video_player_manager.PlayerMessageState;
import com.example.video_player_manager.manager.VideoPlayerManagerCallback;
import com.example.video_player_manager.ui.VideoPlayerView;

public abstract class SetDataSourceMessage extends PlayerMessage {
    public SetDataSourceMessage(VideoPlayerView currentPlayer,
            VideoPlayerManagerCallback callback) {
        super(currentPlayer, callback);
    }

    @Override
    protected PlayerMessageState stateBefore() {
        return PlayerMessageState.SETTING_DATA_SOURCE;
    }

    @Override
    protected PlayerMessageState stateAfter() {
        return PlayerMessageState.DATA_SOURCE_SET;
    }
}

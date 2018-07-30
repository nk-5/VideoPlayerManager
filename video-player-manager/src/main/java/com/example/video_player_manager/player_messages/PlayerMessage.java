package com.example.video_player_manager.player_messages;

import com.example.video_player_manager.Config;
import com.example.video_player_manager.manager.VideoPlayerManagerCallback;
import com.example.video_player_manager.ui.VideoPlayerView;

public abstract class PlayerMessage implements Message {

    private static final String TAG = PlayerMessage.class.getSimpleName();
    private static final boolean SHOW_LOGS = Config.SHOW_LOGS;
    private final VideoPlayerView mCurrentPlayer;
    private final VideoPlayerManagerCallback mCallback;
}

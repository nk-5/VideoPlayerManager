package com.example.video_player_manager.manager;

import com.example.video_player_manager.meta.MetaData;

public interface PlayerItemChangeListener {
    void onPlayerItemChanged(MetaData currentItemMetaData);
}

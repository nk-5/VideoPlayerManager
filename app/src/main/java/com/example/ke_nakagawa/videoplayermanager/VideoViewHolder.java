package com.example.ke_nakagawa.videoplayermanager;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.video_player_manager.ui.VideoPlayerView;

public class VideoViewHolder extends RecyclerView.ViewHolder {

    public final VideoPlayerView mPlayer;

    public VideoViewHolder(View itemView) {
        super(itemView);
        mPlayer = itemView.findViewById(R.id.player);
    }
}

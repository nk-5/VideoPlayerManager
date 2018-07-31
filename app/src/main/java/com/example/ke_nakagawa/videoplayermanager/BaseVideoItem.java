package com.example.ke_nakagawa.videoplayermanager;

import android.app.LauncherActivity;
import android.content.res.AssetFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.video_player_manager.manager.VideoItem;
import com.example.video_player_manager.manager.VideoPlayerManager;
import com.example.video_player_manager.meta.MetaData;
import com.example.video_player_manager.ui.MediaPlayerWrapper;
import com.example.video_player_manager.ui.VideoPlayerView;

//public abstract class BaseVideoItem implements VideoItem {
public class BaseVideoItem implements VideoItem {

    private static final boolean SHOW_LOGS = false;
    private static final String TAG = BaseVideoItem.class.getSimpleName();

    private final VideoPlayerManager<MetaData> mVideoPlayerManager;
    private final AssetFileDescriptor mAssetFileDescriptor;
    private VideoViewHolder videoViewHolder;

    public BaseVideoItem(
            VideoPlayerManager<MetaData> videoPlayerManager,
            AssetFileDescriptor assetFileDescriptor) {
        mVideoPlayerManager = videoPlayerManager;
        mAssetFileDescriptor = assetFileDescriptor;
    }
//    public BaseVideoItem(
//            VideoPlayerManager<MetaData> videoPlayerManager) {
//        mVideoPlayerManager = videoPlayerManager;
//    }

//    public abstract void update(int position, VideoViewHolder view, VideoPlayerManager videoPlayerManager);

    public View createView(ViewGroup parent, int screenWidth) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = screenWidth;

        videoViewHolder = new VideoViewHolder(view);
        view.setTag(videoViewHolder);

        videoViewHolder.mPlayer.addMediaPlayerListener(
                new MediaPlayerWrapper.MainThreadMediaPlayerListener() {
                    @Override
                    public void onVideoSizeChangedMainThread(int width, int height) {

                    }

                    @Override
                    public void onVideoPreparedMainThread() {

                    }

                    @Override
                    public void onVideoCompletionMainThread() {

                    }

                    @Override
                    public void onErrorMainThread(int what, int extra) {

                    }

                    @Override
                    public void onBufferingUpdateMainThread(int percent) {

                    }

                    @Override
                    public void onVideoStoppedMainThread() {

                    }
                });
        return view;
    }

    @Override
    public void playNewVideo(MetaData currentItemMetaData, VideoPlayerView player,
            VideoPlayerManager<MetaData> videoPlayerManager) {

        videoPlayerManager.playNewVideo(currentItemMetaData, player, mAssetFileDescriptor);
    }

    @Override
    public void stopPlayback(VideoPlayerManager videoPlayerManager) {
        videoPlayerManager.stopAnyPlayback();
    }

    public VideoPlayerView getVideoPlayerView() {
        return videoViewHolder.mPlayer;
    }
}

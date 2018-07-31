package com.example.ke_nakagawa.videoplayermanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.video_player_manager.manager.VideoPlayerManager;
import com.example.video_player_manager.meta.CurrentItemMetaData;

import java.util.List;

public class VideoAdapter extends BaseAdapter {

    private final VideoPlayerManager mVideoPlayerManager;
//    private final List<BaseVideoItem> mList;
private final Context mContext;
    View resultView;
    BaseVideoItem videoItem;

//    public VideoAdapter(VideoPlayerManager videoPlayerManager, List<BaseVideoItem> list,
//            Context context) {
//        mVideoPlayerManager = videoPlayerManager;
//        mList = list;
//        mContext = context;
//    }

    public VideoAdapter(VideoPlayerManager videoPlayerManager, Context context) {
        mVideoPlayerManager = videoPlayerManager;
        mContext = context;
        videoItem = new BaseVideoItem(mVideoPlayerManager, mContext.getResources().openRawResourceFd(R.raw.vast_intro));

    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (position == 10) {
//            BaseVideoItem videoItem = mList.get(0);
            if (resultView == null) {
                resultView = videoItem.createView(parent,
                        mContext.getResources().getDisplayMetrics().widthPixels);
                CurrentItemMetaData metaData = new CurrentItemMetaData(position, resultView);
                videoItem.playNewVideo(metaData, videoItem.getVideoPlayerView(), mVideoPlayerManager);
            }
//            } else {
//                resultView = convertView;
//            }
            // TODO: check
//            videoItem.update(position, (VideoViewHolder) resultView.getTag(), mVideoPlayerManager);
            return resultView;

        } else {
            TextView textView = new TextView(mContext);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            textView.setText("test");
            textView.setTextSize(50);
            textView.setLayoutParams(layoutParams);
            return textView;
        }
    }
}

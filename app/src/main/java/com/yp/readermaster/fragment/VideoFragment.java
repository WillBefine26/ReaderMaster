package com.yp.readermaster.fragment;

import android.os.Bundle;

import com.yp.readermaster.R;
import com.yp.readermaster.base.RxLazyBaseFragment;

/**
 * 当前类注释：资讯
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 19:58
 */

public class VideoFragment extends RxLazyBaseFragment{

    public static VideoFragment newInstance(String param2) {
        VideoFragment videoFragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putString("args2", param2);
        videoFragment.setArguments(args);
        return videoFragment;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {

    }

    @Override
    protected void lazyLoad() {

    }
}

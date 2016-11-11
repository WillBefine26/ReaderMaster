package com.yp.readermaster.fragment;

import android.os.Bundle;

import com.yp.readermaster.R;
import com.yp.readermaster.base.RxLazyBaseFragment;


/**
 * 当前类注释：资讯
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 19:58
 * give me five
 */

public class NewsFragment extends RxLazyBaseFragment{

    public static NewsFragment newInstance(String param1) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString("args1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {

    }

    @Override
    protected void lazyLoad() {

    }
}

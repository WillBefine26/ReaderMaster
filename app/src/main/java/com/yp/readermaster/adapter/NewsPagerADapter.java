package com.yp.readermaster.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yp.readermaster.fragment.NewsFragment;
import com.yp.readermaster.fragment.NewsItemFragment;

import java.util.List;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 11:13
 * 首页新闻模块adapter
 */

public class NewsPagerAdapter extends FragmentPagerAdapter{
    private List<String> mTabTitleList;
    public NewsPagerAdapter(FragmentManager fm , List<String> list ) {
        super(fm);
        mTabTitleList = list;
    }

    @Override
    public Fragment getItem(int position) {

        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}

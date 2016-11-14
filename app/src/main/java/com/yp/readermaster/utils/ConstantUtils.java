package com.yp.readermaster.utils;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 11:29
 *   常量参数
 */

public class ConstantUtils {
    /**
     * 加载失败显示的图片
     */
    //public static final int ERROR_IMAGE_ID = R.drawable.loading_image;

    public enum ENewsType {
//        头条，科技，娱乐，社会，国内，国际，体育，军事，财经，时尚
        TOP_NEWS(0, "top", "头条"),
        KEJI_NEWS(1, "keji", "科技"),
        YULE_NEWS(1, "yule", "娱乐"),
        SHEHUI_NEWS(1, "shehui", "社会"),
        GUONEI_NEWS(1, "guonei", "国内"),
        GUOJI_NEWS(1, "guoji", "国际"),
        TIYU_NEWS(1, "tiyu", "体育"),
        JUNSHI_NEWS(1, "junshi", "军事"),
        CAIJING_NEWS(1, "caijing", "财经"),
        SHISHANG_NEWS(1, "shishang", "时尚");

        ENewsType(int index,String type,String title){
            mIndex = index;
            mType = type;
            mTitle = title;
        }
        private int mIndex;
        private String mType;
        private String mTitle;

        public String getType() {
            return mType;
        }
        public String getTitle() {
            return mTitle;
        }
    }
}








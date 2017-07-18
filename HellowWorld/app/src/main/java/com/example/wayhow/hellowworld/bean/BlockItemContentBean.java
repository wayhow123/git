package com.example.wayhow.hellowworld.bean;

/**
 * Created by wayhow on 17/7/16.
 */

public class BlockItemContentBean {

    private String mBlockContentTitle;
    private String mBlockContentContent;
    private String mBlockContentTips;


    public BlockItemContentBean(String mBlockContentTitle, String mBlockContentContent, String mBlockContentTips) {
        this.mBlockContentTitle = mBlockContentTitle;
        this.mBlockContentContent = mBlockContentContent;
        this.mBlockContentTips = mBlockContentTips;
    }

    public String getmBlockContentTitle() {
        return mBlockContentTitle;
    }

    public String getmBlockContentContent() {
        return mBlockContentContent;
    }

    public String getmBlockContentTips() {
        return mBlockContentTips;
    }

    public void setmBlockContentTitle(String mBlockContentTitle) {
        this.mBlockContentTitle = mBlockContentTitle;
    }

    public void setmBlockContentContent(String mBlockContentContent) {
        this.mBlockContentContent = mBlockContentContent;
    }

    public void setmBlockContentTips(String mBlockContentTips) {
        this.mBlockContentTips = mBlockContentTips;
    }
}

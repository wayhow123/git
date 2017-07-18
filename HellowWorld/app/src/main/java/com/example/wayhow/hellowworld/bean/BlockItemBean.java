package com.example.wayhow.hellowworld.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayhow on 17/7/11.
 */

public class BlockItemBean {
    private String mBlockName;
    private List<BlockItemContentBean> mBlockItemContentBeanList = new ArrayList<>();

    public BlockItemBean(String mBlockName, List<BlockItemContentBean> mBlockItemContentBeanList) {
        this.mBlockName = mBlockName;
        this.mBlockItemContentBeanList = mBlockItemContentBeanList;
    }

    public String getmBlockName() {
        return mBlockName;
    }

    public List<BlockItemContentBean> getmBlockItemContentBeanList() {
        return mBlockItemContentBeanList;
    }

    public void setmBlockName(String mBlockName) {
        this.mBlockName = mBlockName;
    }

    public void setmBlockItemContentBeanList(List<BlockItemContentBean> mBlockItemContentBeanList) {
        this.mBlockItemContentBeanList = mBlockItemContentBeanList;
    }
}

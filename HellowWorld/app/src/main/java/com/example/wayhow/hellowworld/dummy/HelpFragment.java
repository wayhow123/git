package com.example.wayhow.hellowworld.dummy;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.wayhow.hellowworld.R;
import com.example.wayhow.hellowworld.bean.BlockItemBean;
import com.example.wayhow.hellowworld.bean.BlockItemContentBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayhow on 17/7/10.
 */

public class HelpFragment extends Fragment implements View.OnClickListener {

    private ListView mBlockListView;
    private TextView mHelp;
    private List<BlockItemBean> mBlockList = new ArrayList<>();
    private ImageButton leftImageButton;
    private ImageButton rightImageButton;
    private ImageView categoryImage;
    private ImageView hotImgae;
    private ImageView topicImage;
    private ImageView mustReadImage;
    private TextView categoryText;
    private TextView hotText;
    private TextView topicText;
    private TextView mustReadText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.help_container, container, false);
        mBlockListView = view.findViewById(R.id.help_list);
        mHelp = view.findViewById(R.id.textView);
        View mHeader = inflater.inflate(R.layout.help_header_layout, null);
        initHeaderView(mHeader);


        initData();
        MyAdapter myAdapter = new MyAdapter(getContext(), R.layout.help_item, mBlockList);
        //HelpHeaderView mHeader = new HelpHeaderView(getContext());
        mBlockListView.addHeaderView(mHeader, null, false);

        mBlockListView.setAdapter(myAdapter);
        return view;
    }

    private void initHeaderView(View mHeader) {
        leftImageButton = mHeader.findViewById(R.id.leftImageButton);
        rightImageButton = mHeader.findViewById(R.id.rigthImageButton);
        categoryImage = mHeader.findViewById(R.id.categoryImage);
        hotImgae = mHeader.findViewById(R.id.hotImage);
        topicImage = mHeader.findViewById(R.id.topicImage);
        mustReadImage = mHeader.findViewById(R.id.mustReadImage);
        categoryText = mHeader.findViewById(R.id.categoryText);
        hotText = mHeader.findViewById(R.id.hotText);
        topicText = mHeader.findViewById(R.id.topicText);
        mustReadText = mHeader.findViewById(R.id.mustReadText);



        Glide.with(this).load(R.drawable.left).into(leftImageButton);
        Glide.with(this).load(R.drawable.right).into(rightImageButton);


        leftImageButton.setOnClickListener(this);
        rightImageButton.setOnClickListener(this);
        categoryImage.setOnClickListener(this);
        categoryText.setOnClickListener(this);
        hotImgae.setOnClickListener(this);
        hotText.setOnClickListener(this);
        topicImage.setOnClickListener(this);
        topicText.setOnClickListener(this);
        mustReadImage.setOnClickListener(this);
        mustReadText.setOnClickListener(this);
    }

    private void initData() {
       List<BlockItemContentBean> mBlcokItemContentBeanList = new ArrayList<>();
        BlockItemContentBean mBlockItemContentBean = new BlockItemContentBean("yme6.7.6.27 beta亮点解析","新增[截图音效]开关[截图音效]开关，声音你说了算。关闭截图系统音效，让你有效避免尴尬；如果你就是喜欢截图巴拉巴拉","系统升级");
        mBlcokItemContentBeanList.add(mBlockItemContentBean);
        BlockItemBean mBlockItemBean = new BlockItemBean("热门反馈",mBlcokItemContentBeanList);
        mBlockList.add(mBlockItemBean);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getActivity(),"Wayhow",Toast.LENGTH_SHORT).show();
    }

    class MyAdapter extends ArrayAdapter {

        private Context mContext;
        private int mResourceId;

        public MyAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
            super(context, resource, objects);
            mContext = context;
            mResourceId = resource;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


            LinearLayout view = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.help_item, null);
            BlockItemBean blockItemBean = (BlockItemBean) getItem(position);
            View contentView = LayoutInflater.from(getContext()).inflate(R.layout.help_item_content_layout,null);
            View contentView2 = LayoutInflater.from(getContext()).inflate(R.layout.help_item_content_layout,null);
            view.addView(contentView);
            view.addView(contentView2);
            return view;
        }
    }


    class HelpHeaderView extends View {

        private View mView;
        private Context mContext;
        private ViewGroup mParent;
        private ImageButton leftImageButton;
        private ImageButton rightImageButton;
        private ImageView categoryImage;
        private ImageView hotImgae;
        private ImageView topicImage;
        private ImageView mustReadImage;
        private TextView categoryText;
        private TextView hotText;
        private TextView topicText;
        private TextView mustReadText;


        public HelpHeaderView(Context context) {
            super(context);
            mContext = context;
            initView();
        }

        public HelpHeaderView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
            mContext = context;
            initView();
        }

        public HelpHeaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            mContext = context;
            initView();
        }

        public HelpHeaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
            mContext = context;
            initView();
        }

        public void initView() {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            mView = inflater.inflate(R.layout.help_header_layout, null);
//            leftImageButton = mView.findViewById(R.id.leftImageButton);
//            rightImageButton = mView.findViewById(R.id.rigthImageButton);
//            categoryImage = mView.findViewById(R.id.categoryImage);
//            hotImgae = mView.findViewById(R.id.hotImage);
//            topicImage = mView.findViewById(R.id.topicImage);
//            mustReadImage = mView.findViewById(R.id.mustReadImage);
//            categoryText = mView.findViewById(R.id.categoryText);
//            hotText = mView.findViewById(R.id.hotText);
//            topicText = mView.findViewById(R.id.topicText);
//            mustReadText = mView.findViewById(R.id.mustReadText);

        }

    }

}

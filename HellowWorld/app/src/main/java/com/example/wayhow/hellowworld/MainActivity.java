package com.example.wayhow.hellowworld;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.wayhow.hellowworld.dummy.FeedbackFragment;
import com.example.wayhow.hellowworld.dummy.HelpFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private HelpFragment help;
    private FeedbackFragment feedback;
    private ListView helpListView;
    private TabLayout mTab;
    private List<Fragment> viewList;
    private String[] tabs = {"帮助","反馈"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        initPager();

    }

    private void initPager() {
        viewList = new ArrayList<>();
        viewList.add(help);
        viewList.add(feedback);

        MyPagerAdapter mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);



    }

    class MyPagerAdapter extends FragmentPagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return viewList.get(position);
        }

        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }

    private void init() {
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        help = new HelpFragment();
        feedback = new FeedbackFragment();
        mTab = (TabLayout) findViewById(R.id.tablayout);
        helpListView = (ListView) findViewById(R.id.help_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:

                break;
            case R.id.remove_item:

                break;
        }

        return true;
    }
}

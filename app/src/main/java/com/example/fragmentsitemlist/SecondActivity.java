package com.example.fragmentsitemlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SecondActivity extends SingleFragmentActivity {
    private String mItemTextString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mItemTextString =
                (String)getIntent()
                        .getSerializableExtra(ItemsListFragment.EXTRA_ITEM_TEXT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected Fragment createFragment() {
        return new SecondFragment();
    }
}

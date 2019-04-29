package com.example.fragmentsitemlist;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {
    public String mItemTextString;
    public TextView mSecondActivityTextView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mItemTextString =
                (String)getActivity()
                        .getIntent()
                        .getSerializableExtra(ItemsListFragment.EXTRA_ITEM_TEXT);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.fragment_second, container, false);
        mSecondActivityTextView = (TextView)view.findViewById(R.id.textView1);
        mSecondActivityTextView.setText(mItemTextString);
        return view;
    }


}

package com.example.fragmentsitemlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class ItemsListFragment extends ListFragment {

    private ArrayList<String> mItems;
    public static final String EXTRA_ITEM_TEXT = "com.example.fragmentsitemlist.item_text";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mItems = new ArrayList<String>();
        mItems.add("One"); mItems.add("Two"); mItems.add("Three");
        ItemsAdapter itemsAdapter = new ItemsAdapter(mItems);
        setListAdapter(itemsAdapter);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items_list, container, false);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
        Intent startSecondActivityIntent = new Intent(getActivity(), SecondActivity.class);
        String selectedText = mItems.get(position);
        startSecondActivityIntent.putExtra(EXTRA_ITEM_TEXT, selectedText);
        startActivity(startSecondActivityIntent);

    }

    private class ItemsAdapter extends ArrayAdapter<String> {
        public ItemsAdapter(ArrayList<String> items) {
            super(getActivity(), android.R.layout.simple_list_item_1, items);
        }
    }


}
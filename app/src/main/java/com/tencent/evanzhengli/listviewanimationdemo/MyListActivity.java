package com.tencent.evanzhengli.listviewanimationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

public class MyListActivity extends BaseActivity {

    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylist);
        mListView = findViewById(R.id.activity_mylist_listview);
    }


    public ListView getListView() {
        return mListView;
    }

    protected MyListAdapter createListAdapter() {
        return new MyListAdapter(this);
    }

}

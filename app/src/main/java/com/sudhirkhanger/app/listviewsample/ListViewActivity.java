package com.sudhirkhanger.app.listviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    /*
     * This is a member variable
     * Any variable that is accessed
     * in several places should be
     * declared as member variable.
     */
    ArrayList<Books> mBooksArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // ListView view should be initialized in the onCreate
        ListView listView = (ListView) findViewById(R.id.listview);

        // mBooksArrayList will be initialized and
        // data will be added to it here
        mBooksArrayList = new ArrayList<>();
        initData();

        // Adapter is initialized and listview is set here
        BooksAdapter booksAdapter = new BooksAdapter(this, mBooksArrayList);
        listView.setAdapter(booksAdapter);
    }

    /*
     * Data is initialized here.
     * This can be anything like
     * downloading book from Google Books API
     * mBooksArrayList is an ArrayList of Books items
     */
    private void initData() {
        for (int i = 0; i < 100; i++) {
            Books books = new Books("title " + i, "author " + i);
            mBooksArrayList.add(books);
        }
    }
}

package com.sudhirkhanger.app.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BooksAdapter extends ArrayAdapter<Books> {

    public BooksAdapter(Context context, ArrayList<Books> booksArrayList) {
        super(context, 0, booksArrayList);
    }


    /*
     * converView is assigned to the book_list_item
     * It can now access each of the UI components of it
     * we will pull title and author and assign them to
     * the proper TextViews
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Books book = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_item, parent, false);
        }

        // Lookup view for data population
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.author_textview);

        // Populate the data into the template view using the data object
        titleTextView.setText(book.getTitle());
        authorTextView.setText(book.getAuthor());
        // Return the completed view to render on screen
        return convertView;
    }
}

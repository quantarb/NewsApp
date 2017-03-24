package com.example.johnnylee.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by johnnylee on 3/24/17.
 */

public class ArticleAdapter extends ArrayAdapter<Article>{

    public ArticleAdapter(Context context, List<Article> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        Article currentArticle = getItem(position);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(formatDate(currentArticle.getPublicationDate()));

        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_text_view);
        sectionTextView.setText(currentArticle.getSectionName());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentArticle.getTitle());


        return listItemView;
    }

    private String formatDate(String dateString) {
        String someDateString = "2016-09-26T15:57:34Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss'Z'");
        Date dateObject = null;
        try {
            dateObject = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy");
        String date = simpleDateFormat.format(dateObject);

        return date;
    }



}

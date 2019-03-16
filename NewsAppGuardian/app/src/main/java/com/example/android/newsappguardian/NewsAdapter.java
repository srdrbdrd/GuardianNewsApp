package com.example.android.newsappguardian;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Serdar on 19.06.2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_layout, parent, false);
        }
        News currentNews = getItem(position);


        TextView topic = (TextView) convertView.findViewById(R.id.topic);
        topic.setText(currentNews.getnTopic());


        TextView headline = (TextView) convertView.findViewById(R.id.headline);
        headline.setText(currentNews.getnHeader());


        TextView author = (TextView) convertView.findViewById(R.id.author);
        author.setText(currentNews.getnAuthor());

        Date dateObject = new Date(String.valueOf(currentNews.getnDateTime()));


        TextView dateView = (TextView) convertView.findViewById(R.id.date);

        String formattedDate = formatDate(dateObject);

        dateView.setText(formattedDate);


        TextView timeView = (TextView) convertView.findViewById(R.id.time);

        String formattedTime = formatTime(dateObject);

        timeView.setText(formattedTime);


        return convertView;

    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }


    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }


}

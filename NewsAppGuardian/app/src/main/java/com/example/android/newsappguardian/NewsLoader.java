package com.example.android.newsappguardian;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Serdar on 19.06.2018.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = NewsLoader.class.getName();

    /**
     * Query URL
     */
    private String nUrl;


    public NewsLoader(Context context, String url) {
        super(context);
        nUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<News> loadInBackground() {
        if (nUrl == null) {
            return null;
        }


        List<News> news = QueryUtils.fetchNewsData(nUrl);
        return news;
    }
}
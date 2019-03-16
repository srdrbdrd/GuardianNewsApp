package com.example.android.newsappguardian;

import java.util.Date;

/**
 * Created by Serdar on 19.06.2018.
 */

public class News {
    private String nHeader;
    private String nUrl;
    private Date nDateTime;
    private String nTopic;
    private String nAuthor;

    public News(String Header, String Url, Date DateTime, String Topic, String Author) {
        nHeader = Header;
        nUrl = Url;
        nDateTime = DateTime;
        nTopic = Topic;
        nAuthor = Author;
    }

    public String getnHeader() {
        return nHeader;
    }

    public String getnUrl() {
        return nUrl;
    }

    public Date getnDateTime() {
        return nDateTime;
    }

    public String getnTopic() {
        return nTopic;
    }

    public String getnAuthor() {
        return nAuthor;
    }
}


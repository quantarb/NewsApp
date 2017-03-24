package com.example.johnnylee.newsapp;

/**
 * Created by johnnylee on 3/24/17.
 */

public class Article {

    private String mTitle;
    private String mSectionName;
    private String mPublicationDate;
    private String mUrl;

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getPublicationDate() {
        return mPublicationDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public Article(String title, String sectionName, String publicationDate, String url) {
        this.mTitle = title;
        this.mSectionName = sectionName;
        this.mPublicationDate = publicationDate;
        this.mUrl = url;
    }


}

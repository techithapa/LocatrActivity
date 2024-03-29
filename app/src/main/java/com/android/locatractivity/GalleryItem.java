package com.android.locatractivity;

import android.net.Uri;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;

    public void setUrl(String url) {
        mUrl = url;
    }
    public String getOwner() {
        return mOwner;
    }
    public void setOwner(String owner) {
        mOwner = owner;
    }
    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }
    @Override
    public String toString() {
        return mCaption;
    }
    public String getId () {
        return mId;
    }

    public void setId(String id) {
        mId =id;
    }
    public String getCaption() {
        return mCaption;
    }
    public void setCaption(String title) {
        mCaption = title;
    }

    public String getUrl() {
        return mUrl;
    }
}

package com.weddingwire.wedblog;

import android.app.Application;
import android.util.Log;
import com.weddingwire.wedblog.models.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mattyeh on 7/7/14.
 */
public class WBApplication extends Application {
    private static final String TAG = WBApplication.class.getSimpleName();
    private List<Post> mPosts;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "custom application created.");
        init();
    }

    private void init() {
        mPosts = new ArrayList<Post>();
    }

    /**
     * Adds post to list
     * @param post Post - Post to add
     */
    public void addPost(Post post) {
        mPosts.add(post);
    }

    public List<Post> getPosts() {
        return mPosts;
    }
}

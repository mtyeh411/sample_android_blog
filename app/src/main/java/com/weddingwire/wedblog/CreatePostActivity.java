package com.weddingwire.wedblog;

import android.app.Activity;
import android.os.Bundle;

public class CreatePostActivity extends Activity {
	private final static String TAG = CreatePostActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
    }
}

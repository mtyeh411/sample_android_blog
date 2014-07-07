package com.weddingwire.wedblog.activities;

import android.app.Activity;
import android.os.Bundle;

import com.weddingwire.wedblog.R;

public class CreatePostActivity extends Activity {
	private final static String TAG = CreatePostActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
    }
}

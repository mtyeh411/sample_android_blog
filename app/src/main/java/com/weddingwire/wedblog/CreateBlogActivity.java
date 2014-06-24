package com.weddingwire.wedblog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CreateBlogActivity extends Activity {
	private final static String TAG = CreateBlogActivity.class.getSimpleName();
	public final static String EXTRA_NAME = "passed_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_blog);

	    TextView text = (TextView) findViewById(R.id.test_field);

	    final String passedData = getIntent().getStringExtra(EXTRA_NAME);
	    text.setText(passedData);
    }
}

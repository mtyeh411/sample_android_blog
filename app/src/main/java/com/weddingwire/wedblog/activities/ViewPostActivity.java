package com.weddingwire.wedblog.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.weddingwire.wedblog.R;

public class ViewPostActivity extends Activity {
    private final static String TAG = ViewPostActivity.class.getSimpleName();
    public final static String EXTRA_NAME = "passed_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);

        String passedDataFromIntent = getIntent().getStringExtra(EXTRA_NAME);
        TextView dataLabel = (TextView) findViewById(R.id.passed_data_text);
        dataLabel.setText(passedDataFromIntent);
    }
}

package com.weddingwire.wedblog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class HomeActivity extends Activity implements View.OnClickListener {
	private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
	    Log.d(TAG, "onCreate");

	    ImageButton imageButton = (ImageButton) findViewById(R.id.feather);
	    imageButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.feather:
				startCreateBlogPost();
				break;
			default:
				throw new RuntimeException("Unknown button click!");
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}

	private void startCreateBlogPost() {
		Intent intent = new Intent(this, CreateBlogActivity.class);
		intent.putExtra(CreateBlogActivity.EXTRA_NAME, "this is a test");
		startActivity(intent);
	}

}

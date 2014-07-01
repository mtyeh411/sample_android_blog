package com.weddingwire.wedblog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends Activity implements View.OnClickListener {
	private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
	    Log.d(TAG, "onCreate");

	    Button writeButton = (Button) findViewById(R.id.write_post);
	    writeButton.setOnClickListener(this);
        Button viewPost = (Button) findViewById(R.id.view_post);
        viewPost.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.write_post:
				startCreateBlogPost();
				break;
            case R.id.view_post:
                startViewPost();
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
		Intent intent = new Intent(this, CreatePostActivity.class);
		startActivity(intent);
	}

    private void startViewPost() {
        Intent intent = new Intent(this, ViewPostActivity.class);
        intent.putExtra(ViewPostActivity.EXTRA_NAME, "This is passed data.");
        startActivity(intent);
    }

}

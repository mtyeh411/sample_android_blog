package com.weddingwire.wedblog.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import com.weddingwire.wedblog.R;
import com.weddingwire.wedblog.WBApplication;
import com.weddingwire.wedblog.models.Post;

public class CreatePostActivity extends Activity implements View.OnClickListener {
	private final static String TAG = CreatePostActivity.class.getSimpleName();
    private EditText mTitle, mAuthor, mBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        Button createButton = (Button) findViewById(R.id.create_post);
        createButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.create_post:
                createBlogPost();
        }
    }

    private void getViewValues() {
        mTitle = (EditText) findViewById(R.id.title);
        mAuthor = (EditText) findViewById(R.id.author);
        mBody = (EditText) findViewById(R.id.body);
    }

    private void createBlogPost() {
        if(valid()) {
            Post post = new Post();
            post.setTitle(mTitle.getText().toString());
            post.setAuthor(mAuthor.getText().toString());
            post.setBody(mBody.getText().toString());

            Log.d(TAG, post.toString());
            addPost(post);

            Toast successToast = Toast.makeText(this, "Successfully posted!", Toast.LENGTH_SHORT);
            successToast.show();

            mTitle.getText().clear();
            mAuthor.getText().clear();
            mBody.getText().clear();
        }
    }

    private void addPost(Post post) {
        ((WBApplication)getApplication()).addPost(post);
    }

    private boolean valid() {
        getViewValues();
        boolean valid = true;
        if(mTitle.getText().length() == 0) {
            mTitle.setError("Title cannot be blank.");
            mTitle.requestFocus();
            valid = false;
        }
        return valid;
    }
}

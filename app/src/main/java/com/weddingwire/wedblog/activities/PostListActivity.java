package com.weddingwire.wedblog.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.weddingwire.wedblog.R;
import com.weddingwire.wedblog.WBApplication;
import com.weddingwire.wedblog.models.Post;

import java.util.List;

public class PostListActivity extends Activity {

    private ListView mPostsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_list);
        mPostsList = (ListView) findViewById(R.id.post_list);
        setupList();
    }

    private void setupList() {
        List<Post> posts = ((WBApplication)getApplication()).getPosts();
        PostAdapter adapter = new PostAdapter(this, android.R.layout.simple_list_item_1, posts);
        mPostsList.setAdapter(adapter);
    }

    private class PostAdapter extends ArrayAdapter<Post> {
        public PostAdapter(Context context, int resource, List<Post> objects) {
            super(context, resource, objects);
        }
    }
}

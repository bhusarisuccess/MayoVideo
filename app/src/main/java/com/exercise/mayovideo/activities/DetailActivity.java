package com.exercise.mayovideo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;


import com.exercise.mayovideo.R;
import com.exercise.mayovideo.models.Video;
import com.exercise.mayovideo.adapters.VideosAdapter;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private List<Video> videosList = new ArrayList<>();
    private RecyclerView recyclerView;
    private VideosAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.rv_video_details);
        prepareVideoData();
        mAdapter = new VideosAdapter(DetailActivity.this, videosList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
               this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void prepareVideoData() {
        Video video = new Video("Mad Max: Fury Road", "https://www.youtube.com/watch?v=G1VvHZ25j_k", "Young Magician With His Unbelievable Never Seen Tricks Blow Entire Audience");
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        videosList.add(video);
        //mAdapter.notifyDataSetChanged();
    }
}

package com.exercise.mayovideo.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import com.exercise.mayovideo.R;
import com.exercise.mayovideo.activities.DetailActivity;
import com.exercise.mayovideo.RecyclerViewClickListener;
import com.exercise.mayovideo.models.Video;

public class VideosAdapter  extends RecyclerView.Adapter<VideosAdapter.MyViewHolder> {

    private List<Video> videosList;
    private Context mContext;





    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        private RecyclerViewClickListener mListener;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tvTitle);

        }

    }


    public VideosAdapter(Context context, List<Video> videosList) {
        this.videosList = videosList;
        this.mContext= context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       Video video = videosList.get(position);
       holder.title.setText(video.getVideoTitle());
      //  holder.genre.setText(movie.getGenre());
      //  holder.year.setText(movie.getYear());
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                  mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return videosList.size();
    }
}

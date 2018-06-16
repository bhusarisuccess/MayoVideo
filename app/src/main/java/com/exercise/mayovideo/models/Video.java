package com.exercise.mayovideo.models;

public class Video {
    String videoTitle;
    String videoUrl;
    String videoSubTitle;

    public Video(String videoTitle, String videoUrl, String videoSubTitle) {
        this.videoTitle = videoTitle;
        this.videoUrl = videoUrl;
        this.videoSubTitle = videoSubTitle;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoSubTitle() {
        return videoSubTitle;
    }

    public void setVideoSubTitle(String videoSubTitle) {
        this.videoSubTitle = videoSubTitle;
    }
}

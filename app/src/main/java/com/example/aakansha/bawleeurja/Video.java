package com.example.aakansha.bawleeurja;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    AppCompatActivity myclass= new AppCompatActivity();
    public static final String API_KEY="AIzaSyB9dbkl7rfjtXpGU4EuE4tfNTRM_JiejEM";
    public static final String VIDEO_ID="eF7BgPsMvG0";
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video);

//        getMclass().getSupportActionBar().setTitle("Organic Farming");
//        getMclass().getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colour1)));
//
//        if (android.os.Build.VERSION.SDK_INT >= 21) {
//            Window window = getMclass().getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.setStatusBarColor(this.getResources().getColor(R.color.colour2));
//        }

        YouTubePlayerView y=(YouTubePlayerView) findViewById(R.id.youtube_player);
        y.initialize(API_KEY,this);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i= new Intent(Video.this,AfterLogIn.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer yp, boolean wasRestored) {

        yp.setPlayerStateChangeListener(ps);
        yp.setPlaybackEventListener(pl);
        if (!wasRestored) {
            yp.cueVideo(VIDEO_ID);
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        Toast.makeText(this, "fail to intialize", Toast.LENGTH_LONG).show();
    }

    private YouTubePlayer.PlaybackEventListener pl=new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    private YouTubePlayer.PlayerStateChangeListener ps=new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };
}

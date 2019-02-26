package com.example.user.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls.add("https://i.redd.it/u2d1e5g4nii21.jpg");
        mNames.add("This is something");

        mImageUrls.add("https://www.reddit.com/r/FortNiteBR/comments/au8p6i/first_season_8_teaser/");
        mNames.add("This is crazy Nazarbayev");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.unsplash.com%2Fphoto-1535498730771-e735b998cd64%3Fixlib%3Drb-1.2.1%26ixid%3DeyJhcHBfaWQiOjEyMDd9%26w%3D1000%26q%3D80&imgrefurl=https%3A%2F%2Funsplash.com%2Fsearch%2Fphotos%2Fflorida&docid=NLasYWrRxsw1yM&tbnid=qr6Oxouds5odfM%3A&vet=10ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhAKAIwAg..i&w=1000&h=1500&client=opera&bih=917&biw=909&q=images&ved=0ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhAKAIwAg&iact=mrc&uact=8");
        mNames.add("I don't know what to write");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.gettyimages.com%2Fgi-resources%2Fimages%2F500px%2F983794168.jpg&imgrefurl=https%3A%2F%2Fwww.gettyimages.com%2Fcollections%2F500px&docid=T_IX7ra8y3ok2M&tbnid=pFGFNV5oo1rdVM%3A&vet=10ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhBKAMwAw..i&w=929&h=700&client=opera&bih=917&biw=909&q=images&ved=0ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhBKAMwAw&iact=mrc&uact=8");
        mNames.add("It is easy to understand it");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.w3schools.com%2Fw3css%2Fimg_lights.jpg&imgrefurl=https%3A%2F%2Fwww.w3schools.com%2Fw3css%2Fw3css_images.asp&docid=R0KnAtfyBDsyiM&tbnid=kwgHAQqTiLQXLM%3A&vet=10ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhFKAcwBw..i&w=600&h=400&client=opera&bih=917&biw=909&q=images&ved=0ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhFKAcwBw&iact=mrc&uact=8");
        mNames.add("because I'm bad");

        mImageUrls.add("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwallpaperbrowse.com%2Fmedia%2Fimages%2F3848765-wallpaper-images-download.jpg&imgrefurl=https%3A%2F%2Fwallpaperbrowse.com%2Fimages%2Fpage%2F3&docid=6uZp7faTvPXIbM&tbnid=ctdQ76MlhhkGBM%3A&vet=10ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhGKAgwCA..i&w=1920&h=1080&client=opera&bih=917&biw=909&q=images&ved=0ahUKEwj6_djhytLgAhUl2OAKHXwSCE0QMwhGKAgwCA&iact=mrc&uact=8");
        mNames.add("Yes, very cool");

        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

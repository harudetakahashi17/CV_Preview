package com.example.harude.hardiyan_apk;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
    }

    public void goToFB(View view){
        webUrl("https://www.facebook.com/HarudeTakahashi");
    }

    public void goToIG(View view){
        webUrl("https://www.instagram.com/harudetakahashi/");
    }

    public void goToGitHub(View view){
        webUrl("https://github.com/harudetakahashi17/");
    }

    public void webUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent act = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(act);
    }
}

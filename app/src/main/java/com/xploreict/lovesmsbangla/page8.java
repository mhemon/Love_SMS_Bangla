package com.xploreict.lovesmsbangla;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class page8 extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mAdView = findViewById(R.id.bannerads);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(this,R.anim.layout_animation_down_to_up);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] messages = {"ভালোবাসি বন্ধু তোকে , বুঝায় কি করে , শুধু জানি তোকে ছাড়া , যাবো আমি মরে । গাছের প্রাণ মাটি, আমার প্রাণ তুমি, তোমার জন্য পৃথিবীতে জম্ম নিছি আমি ।","তোমায় ভালোবাসা ছিলো আমার জীবনের দ্বিতীয় শ্রেষ্ঠ কাজ , আর প্রথমটি ছিলো তোমায় খুজে বেরকরা ভালোবাসি তোমায় এবং সর্বদা বাসবো, আজ বললাম ও সারা জীবন বলবো।","আজকে তুমি রাগ করছো, দু:খ পাবো তাতে । কালকে যখন মরে যাবো, রাগ দেখাবা কাকে? বিধির বিধান এই রকমি, একদিন তো যাবো মরে । বুঝবে সেদিন তুমি, ভালোবাসতাম শুধু তোমাকে ...... !","শুধু কাছে পাওয়ার জন্য ভালবাসা নয়, শুধু ভালো লাগার জন্য ভালবাসা নয়.. নিজের সুখ বিসর্জন দিয়ে ভালবাসার মানুষকে সুখীই রাখার নামই ভালবাসা "," তুমি রাজি থাকলে প্রেম করবো, কাজী এনে বিয়া করব, রাগ করলে কিস করবো, দূরে গেলে মিস করবো, পাশে থাকলে আদর করবো, আর ভুলে গেলে খুব কষ্ট পাবো...!!","আমি সেই সুতো হবো , যে তোমায় আলোকিত করে নিজে জ্বলে যাবো . . . আমি সেই নৌকো হবো , যে তোমায় পার করে নিজেই ডুবে যাবো . . . হবো সেই চোখ যে তোমায় দেখেই বুজে যাবো, হবো সেই সুর যে তোমায় মাতিয়ে করুণ হবো, হবো সেই চাঁদ যে হয়ে গেলে আধ , তোমাকে আলো দেবে দিন ফিরে এলেই আবার ফুরিয়ে যাবো , শুধু ভালোবেসো আমায় !!","এসএমএস হয়ে থাকবো আমি তোমার হৃদয় জুড়ে,, রিংটোন হয়ে বাজবো আমি মিষ্টি মধুর সুরে,, কখনো ভেবোনা আমি তোমার থেকে দূরে,, বন্ধু হয়ে আছি আমি তোমার নয়ন জুড়ে,,।।","আমি জানি তুমি আসবে, পূর্ণিমার চাঁদ হয়ে আমায় ছুঁয়ে দিতে অথবা ভোরের কুয়াশা হয়ে আমায় সিক্ত করতে.. আমি জানি তুমি আসবে, বিকেলের রংধনু দিয়ে আমায় রঙিন সাজাতে অথবা শীতের চাঁদর হয়ে আমায় উষ্ণতা দিতে.. আমি জানি তুমি আসবে, শরতের কাশফুল হয়ে মনটা আমার দোলাতে অথবা বৃষ্টির টুপটাপ শব্দে আমায় উদাসী করতে","এই জীবনে সব পেয়েছি, পাইনি কারো মন জানিনা যে এই জীবনে, কে হবে আপন মনের মত চাই তারে, চাই তার মন হবে কি তুমি, আমার কাছের একজন ॥","মনেতে আকাশ হয়ে রয়েছো ছড়িয়ে,বলনা কোথায় রাখি তোমায় লুকিয়ে ।থাকি যে বিভোর হয়ে শয়নে স্বপনে ॥যেও না হৃদয় থেকে দূরে হারিয়ে, আমি যে ভালবাসি শুধু-ই তোমাকে ॥"};
        recyclerView.setAdapter(new RecyclerAdapter(messages));
        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_all, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.rate){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
            startActivity(browserIntent);
            return true;
        }

        if (id == R.id.moreapps){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Emon+Soft+BD"));
            startActivity(browserIntent);
        }

        if (id == R.id.update){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
            startActivity(browserIntent);
            return true;
        }

        if (id == R.id.action_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String play = "http://play.google.com/store/apps/details?id=";
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Enjoy This Apps " + play + getPackageName());
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
            startActivity(Intent.createChooser(sharingIntent, "Share using"));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

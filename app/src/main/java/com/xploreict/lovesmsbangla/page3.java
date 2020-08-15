package com.xploreict.lovesmsbangla;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class page3 extends AppCompatActivity {

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
        String[] messages = {"সারাক্ষন ভাল থেকো, ভালবাসা মনে রেখ । দিনের বেলা হাসি মুখে, রাতের বেলা অনেক সুখে॥ নানা রঙের স্বপ্ন দেখ, স্বপ্নের মাঝে আমায় রেখ॥","তুমি চাঁদ নও তবে চাঁদের আলো। তুমি ফুল নও তবে ফুলের সৌরভ। তুমি নদী নও তবে নদীর ঢেউ। তুমি অচেনা নও তুমি আমার চেনা কেউ॥","টিপ টিপ বৃষ্টি পড়ে, তোমার কথা মনে পড়ে। এ মন না রয় ঘরে, জানি না তুমি আসবে কবে! এ প্রান শুধু তোমায় ডাকে, আমায় ভালবাসবে বলে! ফুল হাতে থাকবো দাঁড়িয়ে, বলবো আমি তোমায় পেয়ে। সাত সমুদ্র পাড়ি দিয়ে পেয়েছি তোমায় খুঁজে...","একটা আঁকাশে অনেক তাঁরা । একটা জীবনে দূঃখ ভরা । অনেক রকম প্রেমের ভুল । ভুলের জন্য জীবন দিবো । তবুও আমি তোমারই রবো ।","খুব নিশিতে কষ্ট হলে , মাথা রেখ চাঁদের কোলে , তবুও যদি কষ্ট থাকে চোখ রেখ আমার চোখে । কষ্ট রেখোনা বুকের মাঝে পাঠিয়ে দিও আমার কাছে ।","ভালবাসা বুকের ভিতর হয়েছে নিঃশ্বাস, তোমার প্রেমে বেঁচে আছি এই তো বিশ্বাস, জান, আমার জান, তুমি আমার প্রাণের মাঝে প্রাণ | জান, আমার জান, তুমি আমার প্রাণের মাঝে প্রাণ |","ই জীবনে সব পেয়েছি, পাইনি কারো মন জানিনা যে এই জীবনে, কে হবে আপন মনের মত চাই তারে, চাই তার মন হবে কি তুমি, আমার কাছের একজন॥","মনেতে আকাশ হয়ে রয়েছো ছড়িয়ে,বলনা কোথায় রাখি তোমায় লুকিয়ে।থাকি যে বিভোর হয়ে শয়নে স্বপনে॥যেও না হৃদয় থেকে দূরে হারিয়ে,আমি যে ভালবাসি শুধু-ই তোমাকে॥","স্বপ্ন দিয়ে আঁকি আমি, সুখের সীমানা । হৃদয় দিয়ে খুজি আমি, মনের ঠিকানা । ছায়ার মত থাকবো আমি, শুধু তার পাশে, যদি বলে সে আমায় সত্যি ভালবাসে॥","যদি বৃষ্টি হতাম তোমার দৃষ্টি ছুঁয়ে দিতাম।চোখে জমা বিষাদ টুকু এক নিমিষে ধুয়ে দিতাম।মেঘলা বরণ অঙ্গ জুড়ে তুমি আমায় জড়িয়ে নিতে,কষ্ট আর পারতো না তোমায় অকারণে কষ্ট দিতে"};
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

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

public class page9 extends AppCompatActivity {

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
        String[] messages = {"আমি চাইনা তুমি আমাকে বার বার বলো আমি তোমাকে ভালোবাসি. কিনতু আমি চাচছি তুমি আমার জন্য একটু অপেখা করো, আমি বলছিনা তুমি আমাকে অনেক ভালোবাসবে কিনতু আমি বলছি তুমি আমাকে একটু সুযোগ দিও তোমাকে মন উজার করে ভালোবাসতে ।","তুমি সেই কবিতা ! যা প্রতি দিন ভাবি.... লিখতে পারিনা ॥ তুমি সেই ছবি ! যা কল্পনা করি.... আঁকতে পারি না ॥ তুমি সেই ভালবাসা ! যা প্রতিদিন চাই.... কিন্তূ তা কখনো-ই পাই না ॥"," ভালোবাসা হল প্রজাপতির মত। যদি শক্ত করে ধর মরে যাবে! যদি হালকা করে ধর উড়ে যাবে আর যদি যত্ন করে ধর কাছে রবে..","কাউকে দুর থেকে ভালবাসাই সব থেকে পবিত্র ভালোবাসা | কারন, এ ভালোবাসায় কোন রকম অপবিত্রতা থাকে না,, কোন শারীরিক চাহিদা থাকে না । শুধু নীরব কিছু অভিমান থাকে,, যা কখনো কেউ ভাঙায় না | কিছু অশ্রু বিন্দু থাকে যা কেউ কখনো মুছতে আসে না | আর সবার অজান্তে আড়ালে একা যেখানে একজনই রানী/রাজা ।","'ভালোবাসা' শব্দটা হয় না কখনো পুরানো.. হয় না কখনো মলিন.. হয় না ধূসর কিংবা বর্নহীণ.. যা শুধু রংধনুর রঙে রঙিন.. হোক না সেটা এপার কিংবা ওপারের.. তারপরেও ভালোবাসা তো শুধুই ভালোবাসা","৭ ফেব্রুয়ারি= রোজ ডে । ৮ ফেব্রুয়ারি= প্রপোস ডে । ৯ ফেব্রুয়ারি= চকলেট ডে । ১০ ফেব্রুয়ারি= টেডি ডে । ১১ ফেব্রুয়ারি= প্রমিস ডে । ১২ ফেব্রুয়ারি=hug ডে । ১৩ ফেব্রুয়ারি= কিস ডে । ১৪ ফেব্রুয়ারি= হ্যাপি ভ্যালেন্টাইনস ডে ।","যদি বলো তোমার কথা মনে পড়ে কতবার?? আমি বলব চোখের পাতা নড়ে যতবার । যদি বলো তোমায় ভালবাসি কত?? আমি বলব আকাশে তারা আছে যত..!!","তুমি যদি বাসো ভালো,, চাঁদের মতো দেব আলো,, যদি আমায় ভাবো আপন,, হব তোমার মনের মতন,, নদী যেমন দেয় মোহনা,, তেমনি আমি তোমার উপমা,,","মনেতে আকাশ হয়ে রয়েছো ছড়িয়ে,বলনা কোথায় রাখি তোমায় লুকিয়ে ।থাকি যে বিভোর হয়ে শয়নে স্বপনে ॥যেও না হৃদয় থেকে দূরে হারিয়ে, আমি যে ভালবাসি শুধু-ই তোমাকে ॥","যে মানুষ যত বেশি গম্ভীর.. সে মানুষ ততবেশি রাগী.. তবে তার মধ্যে ভালোবাসাও থাকে বেশি..!!"};
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

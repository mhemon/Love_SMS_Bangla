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

public class page4 extends AppCompatActivity {

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
        String[] messages = {"চায়নি হতে তোমার জীবনে কাটা তারের বেড়া, জোর না করে প্রজাপতির মতো আলত করে ধরে রাখতে চেয়েছিলাম । আজ দেখছি আমি তোমার পথে বাধা হয়ে গেছি এবং সেটা সরানোর দায়ভার টাও আমিই নিলাম।","ফুল লাল পাতা সবুজ,মন কেন এতো অবুজ ।কথা কম কাজ বেশি, মন চায় তোমার কাছে আশি । মেঘ চায় বৃষ্টি, চাঁদ চায় নিশি, মন বলে আমি তোমায় অনেক ভালোবাসি... ","একদম নিখুঁত মানুষ খুঁজতে যেও না ,বিধাতা মানুষের ভিতরকিছু কিছু খুত মিশিয়ে দিয়েছে;বেশি নিখুঁত মানুষ খুঁজতে গেলে,তুমি ভালোবাসার কোনোমানুষই পাবে না..!!","তোমারি চোখেরি আঙ্গিনায় ,এখনো কি তেমনি করে জোছনা ছড়াই আলো? এখনো কি তারার ফানে ছেয়ে থাকো আন মনে? তুমি কি আমায় আগের মত বাস ভাল??","পৃথিবীটা তোমারি থাক,পারলে একটু নীল দিও।আকাশটা তোমারি থাক,পারলে একটু তারা দিও।মেঘটা তোমারি থাক,শুধু একটু ভিজতে দিও।মনটা তোমারি থাক,পারলে একটু জায়গা দিও ॥","এক পৃথিবীতে চেয়েছি তোমাকে,এক সাগর ভালবাসা রয়েছে এ বুকে ,যদি কাছে আসতে দাও,যদি ভালবাসতে দাও, এক জনম নয় লক্ষ জনম ভালবাসব তোমাকে","রাজার আছে অনেক ধন. আমার আছে একটি মন. পাখির আছে ছোট্র বাসা. আমার মনে একটি আশা. তোমায় ভালোবাসা.","দুর নিলিমায় রয়েছি তুমার পাসে।খুজে দেখ আমায় পাবে হ্রিদয়ের কাছে। শুনাব না কোন গল্প,গাইব শুধু গান।যে গানে খুজে পাবে ভালবাসার টান।","কখনোও কী লিখেছো স্বপ্নের কবিতা হৃদয়ে,ভালবাসার শ্রাবন নামবে মনের আকাশ ছুঁয়ে।এক আকাশে উড়বো দুজনে স্বপ্নের ডানা মেলে॥করবো তোমায় আলোকিত সুখের প্রদীপ জ্বেলে,চাওয়া পাওয়ার স্বপ্নে॥","কেনো হঠাৎ তুমি এলে?কেনো নয় তবে পুরোটা জুড়ে?আজ পেয়েও হারানো যায়না মানা,বাঁচার মানেটা রয়ে যাবে দূরে।"};
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

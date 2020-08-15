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

public class page10 extends AppCompatActivity {

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
        String[] messages ={"ভালোবাসা হল এমন একটি শ্বাস যাতে শুধু খাটে দুজনার বিশ্বাস এটি হল ছোট্ট সুখের বাসা তাইতো এর নাম রাখা হয়েছে ভালোবাসা।","ভালোবাসা একটি রাবার ব্যান্ডের মত, যার দুপাশ দুজন ধরে থাকে যদি কেউ একজন একপাশ ছেড়ে দেয়, তবে অপরজন আঘাত পায় যাকে আপনি কখনো ভালোবেসেছেন তাকে আঘাত দেয়া আর নিজের সাথে প্রতারনা করা সমান।","যদি ভালবাসো মোরে তবে মোর হাত দুখান ধরে নিয়ে চল অনেক অনেক দূরে,যেথায় তোমাতে আমাতে কথা হবে মুখে মুখে নয়,কেবলই মনে আর মনে |","ভালোবাসা মানে নিল প্রজাপ্রতি..ভালোবাসা মানে রুপালি উজান।ভালোবাসা মানে জোছনার গান।ভালোবাসা মানে উশ্ন সুখের বরফ গলা নদী।","কতটা ভালোবাসি তোমাকে সে তো আমি নিজেও জানিনা...শুধু জানি আমার এই প্রেম-ভালোবাসা মানে না আকাশের সীমানা...চোখ মেলে দেখি আমি ,চোখ বুজে তাকাই সব খানে,তুমি আছো অনুভবে পাই....আমার এই প্রেম নিয়ে জগতের কারো সাথে হয়না তুলনা...কত ভালোবাসতে জানি সে তো আমি নিজেও জানিনা.","মনটা দিলাম তোমার হাতেযতন করে রেখো,,হৃদয় মাঝে ছোট্ট করে আমার ছবি এঁকো..স্বপ্ন গুলো দিলাম তাতে আরও দিলাম আশা,, মনের মতো সাজিয়ে নিও আমার ভালবাসা..","ভালোবাসা তার জন্যযে ভালোবাসতে জানে ..মন তাকে দেওয়া যায়,যে অনুভব করতে জানে !..বিশ্বাস তাকে কর,যে রাখতে জানে ..আর ভালোবাস তাকে,যে ভালোবাসা দিতে জানে........","তোমায় আমি বলতে চাই,তুমি ছাড়া প্রিয় আর কেহ নাই।ভালবাসি শুধু তোমায় আমি,জনম জনম ভালবাসতে চাই।","জানাতে চাই- তোমায় আমিএ হৃদয়ে রয়েছ তুমি।তোমায় নিয়ে সারাক্ষণ,স্বপ্নের জাল বুনে যাই।ভালবাসি শুধু তোমায় আমি,জনম জনম ভালবাসতে চাই।","জানিনা ভালোবাসার আলাদা আলাদা নিয়মআছে কিনা, তবে আমি কোননিয়মে তোমাকে ভালবেসেছি তাও জানিনা,শুধু এইটুকু জানি আমি তোমাকে অনেকঅনেক ভালোবাসি..."};
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

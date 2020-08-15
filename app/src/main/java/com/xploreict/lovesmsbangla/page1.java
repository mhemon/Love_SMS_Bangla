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

public class page1 extends AppCompatActivity {

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
        String[] messages = {"জীবনে ভালোবাসা আসার পূর্বে হাজার বছর একা থাকা যায়। কিন্তু ভালোবাসার পর এক মুহুর্ত একা থাকা যায় না আর ভালোবাসার মানুষটি কিছু সময়ের জন্য কাছে না থাকলে মন টা কেমন বেকুল হয়ে থাকে তাকে কাছে পাওয়ার জন্য হইতোবা এটাই বাস্তবতা....","কাউকে আবেগের ভালোবাসা দিওনা, মনের ভালোবাসা দিও ! কারন আবেগের ভালোবাসা একদিন বিবেকের কাছে হেরে যাবে আর মনের ভালোবাসা চিরদিন থেকে যাবে... ___এলটন ডি","আমি বলতে চাই- বলতে পারিনাই । আমি জানাতে চাই- জানাতে পারিনাই । আমি বুঝাতে চাই- বুঝাতে পারিনাই । আজ সময় এসেছে তাই বলছি, তুমি আমার বাসাই মুরগি চুরি করতে কেন গিয়েছিলে ? উত্তর দাও…!","প্রেম তুমি বরই কঠিন প্রেমে না পরলে বুঝা যায় না। প্রেম তুমি বরই কঠিন প্রেমে না পরলে জীবনকে অনুভব করা যায় না","তুমি সেই স্বপ্নপরী যাকে নিয়ে স্বপ্ন দেখি। তুমি সেই অনুভুতি যাকে আমার মন অনুভব করে। তুমি সেই প্রেমিকা যার ভালবাসার ছন্দ প্রেমিক আমি।","তুমি আমার সৃষ্টিসীমার বাইরে হতে পারকিন্তূ আমার হৃদয় থেকে দূরে নয়॥তুমি আমার নাগালের বাইরে যেতে পারকিন্তূ আমার মন থেকে নয়॥আমি তোমার কাছে কিছু না হতে পারি!But তুমি আমার জীবনের সবকিছু॥","হতে পার তুমি মন থেকে দুরে তথাপিরয়েছো মোর নয়নপুরে॥হয়তো তুমি নেই এই হৃদয়েতবুও রয়েছো পরশেরই ভিতরে।কারণ ভালবাসি শুধুই তোমারে॥"," চাঁদ তুমি যেমন রাতকে ভালোবাস আমিও ঠিক তেমনি ই করে একজনকে ভালোবাসি তোমার ভালোবাসা যেমন কেউ বুঝে না ঠিক তেমনই করে পপি আমার ভালোবাসা বুঝে না","এ নিষ্ঠুর পৃথিবীতে সত্যিকারের ভালোবাসা পাওয়া বড় দায়, সবাই মিষ্টি কথা বলেমন ভোলাতে চায়।আসলে থাকে না কারো অন্তরে ভালোবাসা,স্বার্থের লাগি আছে কাছে মনে অন্য আশা।স্বার্থ উদ্বার হয়ে গেলে,দুঃখ দিয়ে কেটে পড়ে।"," এ নিষ্ঠুর পৃথিবীতে সত্যিকারের ভালোবাসা পাওয়া বড় দায়, সবাই মিষ্টি কথা বলে মন ভোলাতে চায়। আসলে থাকে না কারো অন্তরে ভালোবাসা, স্বার্থের লাগি আছে কাছে মনে অন্য আশা। স্বার্থ উদ্বার হয়ে গেলে, দুঃখ দিয়ে কেটে পড়ে।"};
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

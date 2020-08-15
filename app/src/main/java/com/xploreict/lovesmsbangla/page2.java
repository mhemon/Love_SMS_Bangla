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

public class page2 extends AppCompatActivity {

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
        String[] messages = {"শীতের চাদর জড়িয়ে, কুয়াশার মাঝে দাড়িয়ে, হাত দুটো দাও বারিয়ে, শিশিরের শীতল স্পর্শে যদি, শিহরিত হয় মন' বুঝেনিও আমি আছি তোমার পাশে সারাক্ষন।","নরমাল হাতের সুইট লেখে | বন্ধু আমি ভেরী একা | চাঁদের গাঁয়ে জোসনা মাখা, মোনটা আমার ভিষন ফাকা| ফাকা মোনটা পূরণ কর, একটু আমায় স্বরন কর|","সুন্দর সে তো স্বপ্ন চাইনা মলিন হবে। জীবন সে তো গল্প লিখনা নষ্ট হবে। মন সে তো মন্দির ভেঙ্গোনা পাপ হবে। ভালবাসা সে তো সত্য ভুল বুঝনা হারিয়ে যাবে।।","যতই দূরে হারিয়ে যাও , আমি তোমাকে খুঁজে বের করবোই । যতই পর ভাবো আমায় , আমি তোমাকে আপন করে নেবো । যতই ঘৃনা কর আমায় , আমি চিরদিন এভাবে তোমায় ভালবেসে যাবো । যতই পাষাণ হোক তোমার মন , ওই মনে আমার জন্যে ভালবাসার ফুল ফুটাবোই।","তুমি সেই কবিতা ! যা প্রতি দিন ভাবি.... লিখতে পারিনা॥ তুমি সেই ছবি! যা কল্পনা করি.... আঁকতে পারি না॥ তুমি সেই ভালবাসা! যা প্রতিদিন চাই.... কিন্তূ তা কখনো-ই পাই না॥","আমি সেই সুতো হবো , যে তোমায় আলোকিত করে নিজে জ্বলে যাবো . . . আমি সেই নৌকো হবো , যে তোমায় পার করে নিজেই ডুবে যাবো . . . হবো সেই চোখ যে তোমায় দেখেই বুজে যাবো, হবো সেই সুর যে তোমায় মাতিয়ে করুণ হবো, হবো সেই চাঁদ যে হয়ে গেলে আধ , তোমাকে আলো দেবে দিন ফিরে এলেই আবার ফুরিয়ে যাবো , শুধু ভালোবেসো আমায়","ভালবাসা স্বপ্নীল আকাশের মত সত্য,, শিশির ভেজা ফুলের মত পবিত্র.. কিন্তু সময়ের কাছে পরাজিত,, বাস্তবতার কাছে অবহেলিত..!!","আমি চাইনা তুমি আমাকে বার বার বলো আমি তোমাকে ভালোবাসি. কিনতু আমি চাচছি তুমি আমার জন্য একটু অপেখা করো, আমি বলছিনা তুমি আমাকে অনেক ভালোবাসবে কিনতু আমি বলছি তুমি আমাকে একটু সুযোগ দিও তোমাকে মন উজার করে ভালোবাসতে.","আমার জীবনে কেউ নেই তুমি ছাড়া, আমার জীবনে কোনো স্বপ্ন নেই তুমি ছাড়া , আমার দুচোখ কিছু খোজেনা তোমায় ছাড়া, আমি কিছু ভাবতে পারিনা তোমায় ছাড়া , আমি কিছু লিখতে পারিনা তোমার নাম ছাড়া, আমি কিছু বুঝতে চাইনা তোমায় ছাড়া !","আমার চাওয়া গুলো ছিলো অনেক ছোট,চাইলেই পারতে দিতে..তোমার ঐ মিষ্টি কথায় ,জীবনটা ও পারতে নিতে!!অনেক বেশী বাসতাম ভালো,সব কথাই করতাম বিশ্বাস ..বিনিময়ে দিলে তুমি এক বুক অবিশ্বাস..!!"};
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

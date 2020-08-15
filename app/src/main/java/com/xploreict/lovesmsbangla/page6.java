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

public class page6 extends AppCompatActivity {

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
        String[] messages = {"তুমি হাসতে পারলে, আমিও হাসতে পারবো......তুমি কাঁদতে পারলে, আমিও কাঁদতে পারবো......তুমি ভালোবাসতে পারলে......আমি ও ভালোবাসতে পারবো...।শুধু তোমার মতো করে একটা কাজ আমি করতে পারবোনা তা হল তোমাকে ভুলে যেতে...।","আমি প্রেম কি জানিনা, আমি প্রেম কি বুঝিনা, শুধু ধিকি ধিকি মন যায় জ্বলে! কে জানে হায় কোন আগুনে, মরিব আমি এই ফাগুনে|","যদি পৃথিবীর সব গোলাপ প্রতিদিন একটা করে তোমাকে দিয়ে বলি আমি তোমাকে ভালবাসি ,সব গোলাপ শেষ হয়ে যাবে ..তবুও আমার ভালবাসা শেষ হবে না ..হয়তো আজও আমার ভালবাসার গভীরতা বুঝতে পারো নি ..","হারিয়ে যেতে ইচ্ছে করে অনেক দূরে যেখানে রয়েছে তোমার ভালোবাসার সূখের নীড়। আর সেই নীড়ে কাটিয়ে দিতে চাই শত জনম। আমি কল্পনার সাগরে ভেসে চলে জাব, জাব তোমার হৃদয় সৈকতে, তুমি দিবেনা ধরা?","তুমি কি জান পাখি কেন ডাকে? “তোমার ঘুম ভাংবে বলে। তুমি কি জান ফুল কেন ফুটে? “তুমি দেখবে বলে। তুমি কি জান আকাশ কেন কাদে? “তোমার মন খারাপ বলে। তুমি কি জান তোমাকে সবাই পছন্দ করে কেন? “তুমি খুব ভাল বলে। তুমি কি জান তুমি এত ভালো কেন? “তুমি আমার “বন্দু” বলে।","আকাশ বলে তুমি নীল। বাতাস বলে তুমি বিল। নদী বলে তুমি সিমা হিন। চাঁদ বলে তুমি সুন্দর। ঘাস বলে তুমি সবুজ। ফুল বলে তুমি অবুজ। কিন্তু আমি বলি, তুমি কেমন আছ?","নীল নীলিমায় দূরে কোথায় মন যে হারায় বেকুলতায় মনে পরে যায়। একটা কথা ই মন জানতে চায় অবেলায় অবসরে মনে কি পরে আমায় “আই মিছ ইউ","ভালোবাসার মাঝে সুক আছে। ভালো থাকার মাঝে কষ্ট আছে। দূরে রাখার মাঝে টান আছে। মনে রাখার মাঝে প্রান আছে। তাই মনে রেখ আমায় চিরদিন।","ভালবাসার মানুষটির চোখের দিকে তাকালে পুরো পৃথিবী দেখা যায় ,সেই ভালবাসা চলে গেলে গোটা পৃথিবী আঁধারে ঢেকে যায়","জানিনা কতটুকু ভালবাসি তোমায়,সুদু বলব আমার ভালবাসার শেষ নাই,তুমি যদি এর সীমানা খুজতে যাও তুমি নিজেই হারিয়ে জাবে আমার ভালবাসায়"};
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

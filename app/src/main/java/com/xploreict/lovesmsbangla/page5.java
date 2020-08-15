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

public class page5 extends AppCompatActivity {

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
        String[] messages = {"কোন এক তীর হারা নদীর ধারে। চাঁদ,তারা বসে জুটিয়ে প্রেম করে। তা দেখে রাত হিংসা করে। অন্ধকার লুকিয়ে রেখে আলোয় দেয় ভরে। সে আলোয় চাঁদ,তারা কে হারিয়ে ফেলে। তখন চাঁদ, তারা কে খুঁজতে শুরু করে। এদিকে নদীর এক কোণে বসে তাঁরা কাঁদিয়া,কাঁদিয়া মরে","ভালবাসা মানে আবেগ দ্বারা নিয়ন্ত্রিত হৃদয়ের অভ্যন্তরীণ একটা অনুভুতি, যা কেবল - শুধু মাত্র ভালবাসার মানুষের সামনে ভাষায় অথবা আচরণে প্রকাশ হয় ।","তোমার সুখের জন্য যদি তোমাকে ভুলে যেতে হয়,, তাহলে আমি ভুলে যেতে রাজি.. ভুলতে হয়তো কোনদিন ও পারবো না,, তবে ভুলে থাকার অভিনয় করতে পারবো..!!","দেখো চাঁদের দিকে,, কত যে কষ্ট তার বুকে.. কখনো কালো মেঘ ঢেকে যায়,, কখনো সে জ্যোৎস্না হারায়.. তবুও জ্যোৎস্না ছড়িয়ে সে হাসে,, কারন সে আকাশ কে ভালবাসে..!!","হারিয়ে যেতে ইচ্ছে করে অনেক দূরে যেখানে রয়েছে তোমার ভালোবাসার সূখের নীড়। আর সেই নীড়ে কাটিয়ে দিতে চাই শত জনম। আমি কল্পনার সাগরে ভেসে চলে যাবো, যাবো তোমার হৃদয় সৈকতে,তুমি দিবেনা ধরা?","তুমি যদি বাসো ভালো,,চাঁদের মতো দেব আলো,,যদি আমায় ভাবো আপন,,হব তোমার মনের মতন,,নদী যেমন দেয় মোহনা,,তোমার ই আমি তোমার উপমা,,","তুমি রাজি থাকলে প্রেম করবো, কাজী এনে বিয়া করব, রাগ করলে কিস করবো, দূরে গেলে মিস করবো, পাশে থাকলে আদর করবো, আর ভুলে গেলে খুব কষ্ট পাবো...!!","যদি পৃথিবীকে ধ্বংস করতে একদিন,তৃতীয় মহাযুদ্ধ বাধে,যদি কমে যায় কভু আলো আকাশের ঐ চাদে,তবুও তুমি আমার, শুধু আমার।","মেয়েরা ভুলাতে পারে ছেলেদের মন মিষ্টি কথার ছলে,তাঁরা নিমিষেই ভাসাতে পারে সুখের সাগরে,তাঁরাই আবার ডুবিয়ে মারে চোখের নোনা জলে।খেলতে পারে সুন্দর করে নিঠুর প্রেমের খেলা।দিতে পারে হৃদয় জুড়ে মিছে প্রেমের জ্বালা।","আমি তো হাত বাড়িয়ে দাড়িয়ে আছি তোমার ভালবাসা নিবো বলে।দাও তুমি কতো ভালবাসা দেবে আমায়।বিনিময়ে একটা হৃদয় তোমায় দিবো যা কখনো ফিরিয়ে নেবার নয়।"};
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

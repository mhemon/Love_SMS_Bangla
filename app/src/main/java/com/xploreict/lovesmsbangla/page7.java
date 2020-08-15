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

public class page7 extends AppCompatActivity {

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
        String[] messages = {"কোনো এককুয়াশা ভেজা সকালে দেখেছিলাম তোমায়দেখেছিলাম সাদাসিধে সাজেএলোমেলো চুলে মুখ ঢেকে যায়আর পাগল হয়ে যাই আমিকি নিষ্পাপ চাহুনী তার চোখের ভাষায় বলে দিতে চায়আমিও ভালবাসি তোমায়.......","জীবনকে খুজতে গিয়ে তোমাকে পেয়েছি, নিজেকে ভালবাসতে গিয়ে তোমার প্রেমে পরেছি, জানতাম না কাকে বলে ভালো ভালবাসা, শিখিয়েছ তুমি।…"," জানিনা তুমি কে..আর কেনইবা ডাকি তোমায় আমি ,তোমার জন্য নিশি জাগি আর একলাই বসে থাকি,তুমিথ অদেখা সেই স্বপ্ন ,তুমি আমার কল্পনার রাজকুমারী।","ভালবাসা কি? তপ্ত মরুর বালুর শিখা,ভালবাসা কি? নদীর স্রোতে ভাসমানকোনো ণৌকা, ভালবাসা কি?ভেসে আসা কোনো সুখের ভেলা,ভালবাসা কি? দুখের মাঝে হাসি মিশ্রিতকান্না, ভালবাসা কি? কোনো এক অজানা ঠিকানা? ভালবাসা কি?ভালবাসা কাকে বলে?","খুঁজিনি কারো মন, তোমার মন পাব বলে।ধরিনি কারো হাত, তোমার হাত ধরবো বলে।হাঁটিনি কারো সাথে, তোমারসাথে হাঁটবো বলে। কাউকে বাসিনি ভালো,তোমাকে ভালবাসি বলে।","িষ্টি হেসে কথা বলে পাগল করে দিলে,তোমায় নিয়ে হারিয়ে যাব আকাশের নীলে,তোমার জন্য মনে আমার অফুরন্ত আশা।সারা জীবন পেতে চাই তোমার ভালবাসা। -","ভালোবাসা মানে তুমি কতবার‘'তোমাকে ভালোবাসি'’বলতে পারো তা নয়..., ভালোবাসা হলো তুমি কতবার‘'তোমাকি ভালোবাসি'’ কথাটি প্রমানকরতে পারো সেটা","ভালোবাসা এমনি হয়, কেউ জিতে কেউ হারে। আমি না হয় হারলাম, তোমার সুখের তরে। হয়তো তোমায় হারিয়ে, কষ্ট পাবো বেশি। তবুও দেখতে পাবো, তোমার মুখের একটু হাসি..!!","তোকে কেন ভালো লাগে জানিনা, তোকে কেন ভালোবাসি তাও জানিনা, শুদু একটা কথাই জানি তোকে যে কত ভালোবাসি সেটা তুই আজও জানিস না","আমি তোমাকে হারাবো জেনেও চেয়েছি..... আমি তোমাকে না পেয়েও পেয়েছি..... তার বেদনায় আমি অঝরে কেদেছি.... কারন আমি তোমাকে পাবোনা জেনেও ভালবেসেছি...!!!!"};
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

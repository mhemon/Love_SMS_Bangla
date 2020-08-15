package com.xploreict.lovesmsbangla;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import static com.google.firebase.messaging.Constants.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialog;
import com.bestsoft32.tt_fancy_gif_dialog_lib.TTFancyGifDialogListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button moreapps;
    Button star;

    String message="";
    private InterstitialAd mInterstitialAd;

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "getInstanceId failed", task.getException());
                            return;
                        }

                        // Get new Instance ID token
                        String token = task.getResult().getToken();

                        // Log and toast
                        Log.d(TAG, "Firebase Token:-"+token);
                        //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.full_screen_ads));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        button = findViewById(R.id.main_button);
        moreapps = findViewById(R.id.more_button);
        star = findViewById(R.id.five_star_button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllSmsContainer.class);
                startActivity(intent);
            }
        });

        moreapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Emon+Soft+BD"));
                startActivity(browserIntent);
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
                startActivity(browserIntent);
            }
        });


        if (getIntent().getExtras()!=null){
            message= getIntent().getExtras().getString("love_messages");
            new TTFancyGifDialog.Builder(MainActivity.this)
                    .setTitle("Love SMS Bangla")
                    .setMessage(message)
                    .setPositiveBtnText("Copy")
                    .setPositiveBtnBackground("#22b573")
                    .setNegativeBtnText("Cancel")
                    .setNegativeBtnBackground("#c1272d")
                    .setGifResource(R.drawable.gif1)      //pass your gif, png or jpg
                    .isCancellable(false)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                            ClipData clip = ClipData.newPlainText("label", message);
                            clipboard.setPrimaryClip(clip);
                            //Toast.makeText(getApplicationContext(), "SMS Copied", Toast.LENGTH_SHORT).show();
                            Toasty.success(MainActivity.this, "SMS Copied!", Toast.LENGTH_SHORT, true).show();
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }
                        }
                    })
                    .OnNegativeClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }
                        }
                    })
                    .build();

            if (message==null){
                message="";
            }
        }


    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
    }this.doubleBackToExitPressedOnce = true;
        Toasty.info(this, "Tap again to exit app", Toast.LENGTH_SHORT, true).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
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

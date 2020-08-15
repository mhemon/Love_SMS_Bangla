package com.xploreict.lovesmsbangla;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class AllSmsContainer extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sms_container);

        mAdView = findViewById(R.id.adview);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.full_screen_ads));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        b1 = findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (mInterstitialAd.isLoaded()){
                        mInterstitialAd.show();
                    }else {
                        Intent intent = new Intent(AllSmsContainer.this,page1.class);
                        startActivity(intent);
                    }
                    mInterstitialAd.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            Intent intent = new Intent(AllSmsContainer.this,page1.class);
                            startActivity(intent);
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }
                    });
            }
        });


        b2 = findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page2.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page2.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });
        b3 = findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page3.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page3.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b4 = findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page4.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page4.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b5 = findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page5.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page5.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b6 = findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page6.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page6.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b7 = findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page7.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page7.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b8 = findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page8.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page8.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b9 = findViewById(R.id.btn9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page9.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page9.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });

        b10 = findViewById(R.id.btn10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }else {
                    Intent intent = new Intent(AllSmsContainer.this,page10.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Intent intent = new Intent(AllSmsContainer.this,page10.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });
            }
        });
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

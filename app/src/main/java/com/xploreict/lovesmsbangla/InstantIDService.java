package com.xploreict.lovesmsbangla;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by YoYo on 1/3/2017.
 */
public class InstantIDService extends FirebaseInstanceIdService{
    private static final String REG_TOKEN="REG_TOKEN";


    @Override
    public void onTokenRefresh() {
        String token= FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,token);
    }
}

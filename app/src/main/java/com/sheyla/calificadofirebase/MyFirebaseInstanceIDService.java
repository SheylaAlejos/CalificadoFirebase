package com.sheyla.calificadofirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by Sheyla on 1/06/2018.
 */

public class MyFirebaseInstanceIDService {


    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        FirebaseMessaging.getInstance().subscribeToTopic("ALL");
    }

}

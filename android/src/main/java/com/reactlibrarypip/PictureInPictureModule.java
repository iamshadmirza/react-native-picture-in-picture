package com.reactlibrarypip;

import android.app.Activity;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class PictureInPictureModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public PictureInPictureModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "PictureInPicture";
    }

    @ReactMethod
    public void showAlertToast(String text) {
        Context context = getReactApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    @ReactMethod
    public void start() {
        final Activity activity = getCurrentActivity();
        if(hasSystemFeature(PackageManager.FEATURE_PICTURE_IN_PICTURE)){
            activity.enterPictureInPictureMode();
            return;
        } else {
            Context context = getReactApplicationContext();
            String text = "Your device is not supported";
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }

    }

    public boolean hasSystemFeature (String featureName){
//        FeatureInfo.getSystemAvailableFeatures();
        return true;
    }
}

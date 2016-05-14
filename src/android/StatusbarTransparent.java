package com.jijesh.cordova.plugin.statusbar;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.view.WindowManager.LayoutParams;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.graphics.Color;
import android.view.View;


	import org.apache.cordova.CordovaInterface;
 import org.apache.cordova.CordovaWebView;

public class StatusbarTransparent extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
           
cordova.getActivity().getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    //Status bar color, set to whatever opacity/color you want

    cordova.getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT);
                
        }
    }
}
               
		
	 

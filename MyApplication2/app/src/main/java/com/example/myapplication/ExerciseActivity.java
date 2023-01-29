package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class ExerciseActivity extends Activity {
    WebView video;
    String str;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        video=(WebView)findViewById(R.id.vv);
        video.setWebViewClient(new WebViewClientClass());
        WebSettings settings=video.getSettings();
        settings.setBuiltInZoomControls(true);

        str="https://www.youtube.com/watch?v=lKwZ2DU4P-A";
        video.loadUrl(str);

    }
    class WebViewClientClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}

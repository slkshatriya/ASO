package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen7 extends AppCompatActivity {
    private WebView webview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);
        webview7 = (WebView)findViewById(R.id.webview7);

        webview7.setWebViewClient(new WebViewClient());

        webview7.loadUrl("https://www.flickr.com");
    }

    @Override
    public void onBackPressed() {
        if (webview7.canGoBack()){
            webview7.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

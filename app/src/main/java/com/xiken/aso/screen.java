package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        webview = (WebView)findViewById(R.id.webview);

        webview.setWebViewClient(new WebViewClient());

        webview.loadUrl("https://www.facebook.com");
    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

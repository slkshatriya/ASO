package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen2 extends AppCompatActivity {
    private WebView webview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        webview2 = (WebView)findViewById(R.id.webview2);
        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.getSettings().setDomStorageEnabled(true);

        webview2.setWebViewClient(new WebViewClient());

        webview2.loadUrl("https://www.instagram.com");
    }

    @Override
    public void onBackPressed() {
        if (webview2.canGoBack()){
            webview2.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

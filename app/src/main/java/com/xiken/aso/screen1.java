package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen1 extends AppCompatActivity {
    private WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        webview1 = (WebView)findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        webview1.getSettings().setDomStorageEnabled(true);

        webview1.setWebViewClient(new WebViewClient());

        webview1.loadUrl("https://www.twitter.com");
    }

    @Override
    public void onBackPressed() {
        if (webview1.canGoBack()){
            webview1.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

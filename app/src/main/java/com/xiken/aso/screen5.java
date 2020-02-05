package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen5 extends AppCompatActivity {
    private WebView webview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
        webview5 = (WebView)findViewById(R.id.webview5);

        webview5.setWebViewClient(new WebViewClient());

        webview5.loadUrl("https://www.reddit.com");
    }

    @Override
    public void onBackPressed() {
        if (webview5.canGoBack()){
            webview5.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

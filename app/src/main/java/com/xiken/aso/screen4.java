package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen4 extends AppCompatActivity {
    private WebView webview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        webview4 = (WebView)findViewById(R.id.webview4);
        webview4.getSettings().setJavaScriptEnabled(true);
        webview4.getSettings().setDomStorageEnabled(true);

        webview4.setWebViewClient(new WebViewClient());

        webview4.loadUrl("https://www.youtube.com");
    }

    @Override
    public void onBackPressed() {
        if (webview4.canGoBack()){
            webview4.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

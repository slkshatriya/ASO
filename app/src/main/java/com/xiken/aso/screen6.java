package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen6 extends AppCompatActivity {
    private WebView webview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
        webview6 = (WebView)findViewById(R.id.webview6);
        webview6.getSettings().setJavaScriptEnabled(true);
        webview6.getSettings().setDomStorageEnabled(true);

        webview6.setWebViewClient(new WebViewClient());

        webview6.loadUrl("https://in.pinterest.com");
    }

    @Override
    public void onBackPressed() {
        if (webview6.canGoBack()){
            webview6.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

package com.xiken.aso;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class screen3 extends AppCompatActivity {
    private WebView webview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        webview3 = (WebView)findViewById(R.id.webview3);

        webview3.setWebViewClient(new WebViewClient());

        webview3.loadUrl("https://www.linkedin.com");
    }

    @Override
    public void onBackPressed() {
        if (webview3.canGoBack()){
            webview3.goBack();
        }else {
            super.onBackPressed();
        }
    }
}

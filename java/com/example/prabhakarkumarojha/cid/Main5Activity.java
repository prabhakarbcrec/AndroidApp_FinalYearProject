package com.example.prabhakarkumarojha.cid;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        webView = (WebView) findViewById(R.id.webviewandroid);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBarandroid);
        textView = (TextView) findViewById(R.id.textViewandroid);
        webView.setWebViewClient(new Main5Activity.myWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://data-flair.training/blogs/hadoop-hdfs-tutorial/");
    }
    public class myWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar2.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode== android.view.KeyEvent.KEYCODE_BACK)&&webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}

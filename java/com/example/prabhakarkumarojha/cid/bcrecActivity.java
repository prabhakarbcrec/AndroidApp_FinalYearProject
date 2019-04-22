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

public class bcrecActivity extends AppCompatActivity {

    WebView webViewbcrec;
    ProgressBar progressBar2bcrec;
    TextView textViewbcrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcrec);
        webViewbcrec = (WebView) findViewById(R.id.webviewbcrec);
        progressBar2bcrec = (ProgressBar) findViewById(R.id.progressBar2bcrec);
        textViewbcrec = (TextView) findViewById(R.id.textViewbcrec);
        webViewbcrec.setWebViewClient(new bcrecActivity.myWebViewClient());
        webViewbcrec.getSettings().setJavaScriptEnabled(true);
        webViewbcrec.loadUrl("http://bcrec.ac.in/");
    }
    public class myWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar2bcrec.setVisibility(View.GONE);
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
        if ((keyCode== android.view.KeyEvent.KEYCODE_BACK)&&webViewbcrec.canGoBack()){
            webViewbcrec.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}

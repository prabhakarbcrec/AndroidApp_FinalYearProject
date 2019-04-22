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

public class MakautActivity extends AppCompatActivity {

    WebView webViewM;
    ProgressBar progressBar2M;
    TextView textViewM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makaut);

        webViewM = (WebView) findViewById(R.id.webviewmakaut);
        progressBar2M = (ProgressBar) findViewById(R.id.progressBar2makaut);
        textViewM = (TextView) findViewById(R.id.textViewmakaut);
        webViewM.setWebViewClient(new MakautActivity.myWebViewClient());
        webViewM.getSettings().setJavaScriptEnabled(true);
        webViewM.loadUrl("https://www.makautexam.net");
    }
    public class myWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar2M.setVisibility(View.GONE);
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
        if ((keyCode== android.view.KeyEvent.KEYCODE_BACK)&&webViewM.canGoBack()){
            webViewM.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}

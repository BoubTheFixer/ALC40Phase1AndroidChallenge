package ug.blogspot.boubandroid.alc40phase1androidchallenge;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    private WebView mywebview;
    ProgressDialog progress;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        progress = new ProgressDialog(ActivityB.this);
        progress.setTitle(  "LOADING");
        progress.setMessage("Please wait while the page loads");
        progress.setCancelable(false);
        progress.setCanceledOnTouchOutside(false);
        progress.show();

        mywebview=findViewById(R.id.webView);
        mywebview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                progress.hide();
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(ActivityB.this, ""+description, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        mywebview.getSettings().setLoadsImagesAutomatically(true);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setScrollBarStyle(View.VISIBLE);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.getSettings().setSupportZoom(true);
        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);
        mywebview.getSettings().setAllowContentAccess(true);
        mywebview.loadUrl("https://andela.com/alc");

    }
    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack()) {
            mywebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
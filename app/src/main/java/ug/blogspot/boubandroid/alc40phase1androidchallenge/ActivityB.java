package ug.blogspot.boubandroid.alc40phase1androidchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        mywebview=findViewById(R.id.webView);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.getSettings().setLoadsImagesAutomatically(true);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setScrollBarStyle(View.VISIBLE);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.getSettings().setSupportZoom(true);
        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);
        mywebview.getSettings().setAllowContentAccess(true);
        mywebview.loadUrl("https://www.andela.com/alc/");
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

package jp.test.webapp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewTableActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewlayouttable);



        mWebView = (WebView)findViewById(R.id.webView1);
        mWebView.loadUrl("https://www.ena.travel/sp/");

    }
}

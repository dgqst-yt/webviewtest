package jp.test.webapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewlayout);



        mWebView = (WebView)findViewById(R.id.webView1);
        mWebView.loadUrl("https://www.ena.travel/sp/");

    }
}

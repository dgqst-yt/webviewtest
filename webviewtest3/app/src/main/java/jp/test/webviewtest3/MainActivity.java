package jp.test.webviewtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String D_HOME_URL = "https://www.ena.travel/sp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());


        findViewById(R.id.btn_home).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myWebView.loadUrl(D_HOME_URL);
            }
        });

        findViewById(R.id.btn_prev).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myWebView.goBack();
            }
        });
        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myWebView.goForward();
            }
        });
        findViewById(R.id.btn_reload).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myWebView.reload();
            }
        });
    }
}

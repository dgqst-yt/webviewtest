package jp.test.webviewtest3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GeneralWebViewAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewbtn);

        CreateWebView();
    }


    private void CreateWebView(){
        final String D_HOME_URL = "https://www.ena.travel/sp/";
        //final String D_HOME_URL = "http://www.yahoo.co.jp/";

        final WebView myWebView = (WebView) findViewById(R.id.webview);



        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String urlStr) {
                return false;
            }
        });


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
                myWebView.reload();// reload 更新OK financeで確認済み
            }
        });


        myWebView.loadUrl(D_HOME_URL);
    }

}

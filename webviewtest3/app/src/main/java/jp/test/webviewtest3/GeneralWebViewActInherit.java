package jp.test.webviewtest3;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GeneralWebViewActInherit extends GeneralWebViewAct {
    @Override
    protected void CreateWebView(){
        setContentView(R.layout.webviewbtn2);

        final String D_HOME_URL = "https://www.ena.travel/sp/";
        //final String D_HOME_URL = "http://www.yahoo.co.jp/";

        final WebView myWebView = (WebView) findViewById(R.id.webview);


        CreateWebViewButtonEvent(myWebView, D_HOME_URL);

        myWebView.loadUrl(D_HOME_URL);
    }

}

package jp.test.webviewtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onStart(){
        super.onStart();
        //Intent activity = new Intent(this, GeneralWebViewAct.class);
        Intent activity = new Intent(this, GeneralWebViewActInherit.class);
        startActivity(activity);
    }

}

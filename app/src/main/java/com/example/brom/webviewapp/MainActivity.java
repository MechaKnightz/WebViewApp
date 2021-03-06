package com.example.brom.webviewapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    // Create a private member variable that can hold our WebView

    WebView myWebView;
    WebView internalWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* This code is run when the App is created. Include code that creates your WebView */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // The FAB-code can be removed
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        WebViewClient webClient = new WebViewClient();

        myWebView = (WebView)findViewById(R.id.my_webview);

        myWebView.getSettings().setJavaScriptEnabled(true);

        myWebView.setWebViewClient(webClient);

        myWebView.loadUrl("http://wwwlab.iit.his.se/a18conch/Webbsida-dice/");

        internalWebView = (WebView)findViewById(R.id.internal_webView);
        internalWebView.loadUrl("file:///android_asset/about.html");
        //webView.loadUrl("file:///android_asset/about.html");

        // 0. Enable Internet access for your App
        // 1. Create a WebView element in the layout file content_main.xml
        // 2. Give the WebView element ID "my_webview"
        // -- Commit and push to your github fork
        // 3. Create a private member variable called "myWebView" of type WebView
        // 4. Locate the WebView element created in step 1 using the ID created in step 2
        // 5. Create a new WebViewClient to attach to our WebView. This allows us to
        //    browse the web inside our app.
        // -- Commit and push to your github fork
        // 6. Enable Javascript execution in your WebViewClient
        // 7. Enter the url to load in our WebView
        // -- Commit and push to your github fork
        // 8. Take a snapshot showing your App
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

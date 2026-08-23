package com.byunggi.todo;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 private WebView webView;
 @Override public void onCreate(Bundle b){ super.onCreate(b); webView=new WebView(this); webView.setWebViewClient(new WebViewClient()); WebSettings s=webView.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); setContentView(webView); webView.loadUrl("file:///android_asset/index.html"); }
}

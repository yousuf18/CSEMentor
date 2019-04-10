package com.example.csementor;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class browsing extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsing);
        webView=findViewById(R.id.browse);

        if(isNetworkAvailable()==false)

        {
            Toast.makeText(this, "Network not available", Toast.LENGTH_SHORT).show();
        }

        WebSettings webSettings=webView.getSettings();

        webSettings.setJavaScriptEnabled(true);


        try {
            Bundle bun = getIntent().getExtras();
            String val = bun.getString("b");
            String key1 = "algo_geek";
            String key2="algo_tuto";
            String key3="algo_safu";
            String key4="cplus_c_academy";
            String key5="Learn_Java";
            String key6="learn_python";
            String key7="c_tuto";


            if (val.equals(key1)) {

                webView.loadUrl("https://www.geeksforgeeks.org/fundamentals-of-algorithms/");
            }
            else if(val.equals(key2))
            {
                webView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/");
            }
            else if(val.equals(key3))
            {
                webView.loadUrl("http://www.shafaetsplanet.com/");
            }
            else if(val.equals(key4))
            {
                webView.loadUrl("https://www.codecademy.com/");
            }
            else if(val.equals(key5))
            {
                webView.loadUrl("https://www.learnjavaonline.org/");
            }
            else if(val.equals(key6)) {

                webView.loadUrl("https://www.edx.org/");

            }
            else if(val.equals(key7)) {

                webView.loadUrl("https://www.learn-c.org/");

            }




        }catch (Exception ex){}
        webView.setWebViewClient(new WebViewClient(){



            @Override

            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                super.onPageStarted(view, url, favicon);

            }



            @Override

            public void onPageFinished(WebView view, String url) {

                super.onPageFinished(view, url);



            }



        });


        webView.setWebChromeClient(new WebChromeClient(){

            @Override

            public void onProgressChanged(WebView view, int newProgress) {

                super.onProgressChanged(view, newProgress);


            }



            @Override

            public void onReceivedTitle(WebView view, String title) {

                super.onReceivedTitle(view, title);

                getSupportActionBar().setTitle(title);

            }



        });

        webView.setDownloadListener(new DownloadListener() {
            @Override

            public void onDownloadStart(String url, String userAgent,

                                        String contentDisposition, String mimetype,

                                        long contentLength) {

                DownloadManager.Request request = new DownloadManager.Request(

                        Uri.parse(url));



                request.allowScanningByMediaScanner();

                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); //Notify client once download is completed!

                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "CSEMentor.pdf");

                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

                dm.enqueue(request);

                Toast.makeText(getApplicationContext(), "Downloading File...Please wait", //To notify the Client that the file is being downloaded

                        Toast.LENGTH_LONG).show();

            }

        });

    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
    private boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        return activeNetworkInfo != null && activeNetworkInfo.isConnected();

    }
}

package gooner.demo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var mWebView: WebView
    lateinit var mUrlTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebView = findViewById(R.id.main_web_view)
        mUrlTxt = findViewById(R.id.main_url_txt)

        mWebView.webViewClient = MyWebViewClient(mUrlTxt)

        mWebView.settings.loadsImagesAutomatically = true

        mWebView.loadUrl("https://developer.android.com/guide/webapps/webview")

        val webChromeClient = WebChromeClient()

        mWebView.webChromeClient = object : WebChromeClient() {

            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
//                mUrlTxt.text = " Progress: " + newProgress.toString()
            }

            override fun onReceivedTitle(view: WebView?, title: String?) {
                super.onReceivedTitle(view, title)
                mUrlTxt.text = " Title: " + title

            }

            on
        }

    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && this.mWebView.canGoBack()) {
            this.mWebView.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}

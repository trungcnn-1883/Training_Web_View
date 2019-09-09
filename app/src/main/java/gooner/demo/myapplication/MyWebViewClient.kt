package gooner.demo.myapplication

import android.graphics.Bitmap
import android.util.Log
import android.webkit.*
import android.widget.TextView

class MyWebViewClient : WebViewClient {

    companion object {
        const val TAG = "MyWebViewClient"
    }

    lateinit var mAddressBar: TextView

    constructor(addressBar: TextView) : super() {
        mAddressBar = addressBar
    }


    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
        mAddressBar.text = request.url.toString()
        return super.shouldOverrideUrlLoading(view, request)
    }

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
        Log.d(TAG, "onPageStarted")
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
        Log.d(TAG, "onPageFinished")

    }

    override fun onLoadResource(view: WebView, url: String) {
        super.onLoadResource(view, url)
        Log.d(TAG, "onLoadResource")
    }

    override fun onReceivedHttpError(
        view: WebView?,
        request: WebResourceRequest?,
        errorResponse: WebResourceResponse
    ) {
        super.onReceivedHttpError(view, request, errorResponse)
        Log.d(TAG, "Error Http " + errorResponse.responseHeaders.toString())
    }

    override fun onReceivedError(view: WebView?, request: WebResourceRequest, error: WebResourceError?) {
        super.onReceivedError(view, request, error)
        Log.d(TAG, "Error normal" + request.requestHeaders.toString() + error.toString())

    }


}
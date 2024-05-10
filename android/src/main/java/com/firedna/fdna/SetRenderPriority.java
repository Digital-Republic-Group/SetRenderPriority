package com.firedna.fdna;

import android.util.Log;

public class SetRenderPriority {

    public String echo(String value) {
        Log.i("Echo", value);
        webView.setRendererPriorityPolicy(WebView.RENDERER_PRIORITY_IMPORTANT, false);
        
        return value;
    }
}

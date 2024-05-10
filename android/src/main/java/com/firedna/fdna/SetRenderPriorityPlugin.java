package com.firedna.fdna.plugins.SetRenderPriority;

import android.webkit.WebView;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "SetRenderPriority")
public class SetRenderPriorityPlugin extends Plugin {
    private SetRenderPriority implementation;

    public void load(WebView webview) {
        implementation = new SetRenderPriority(getActivity());
    }
//    @PluginMethod()
//    public void setRenderPriority(WebView webview) {
//        webview.setRendererPriorityPolicy(WebView.RENDERER_PRIORITY_IMPORTANT, false);
//    }
    @PluginMethod
    public void setRenderPriority(PluginCall call) {
        // Implement the method logic here for Android WebView
        JSObject ret = new JSObject();
        // your logic
        call.resolve(ret);
    }

}
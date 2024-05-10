package com.firedna.fdna.plugins.SetRenderPriority;
import androidx.appcompat.app.AppCompatActivity;

public class SetRenderPriority {
    private AppCompatActivity activity;

    public SetRenderPriority(AppCompatActivity activity) {
    }

    public void ScreenOrientation(AppCompatActivity activity) {
        this.activity = activity;
    }
    public String getCurrentOrientationType() {
        return "text";
    }
}

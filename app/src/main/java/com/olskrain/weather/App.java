package com.olskrain.weather;

import android.app.Application;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;

import es.dmoral.toasty.Toasty;


public class App extends Application {//класс чтобы подтянуть  Toasty. а вообще для общих настроек кода

    @Override
    public void onCreate() {
        super.onCreate();
        Toasty.Config.getInstance().setSuccessColor(getResources().getColor(R.color.blue)).apply();
    }
}

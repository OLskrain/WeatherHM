package com.olskrain.weather;

import android.graphics.Bitmap;

public interface BaseView { //скелет нашего приложения

    interface View {

        Boolean inNetworkAvailable(); //метод для проверки интернета

        void initDrawer(String username, Bitmap profileImage); //
    }

    interface Presenter<V> {//скелет класса, котрый будет работать с бизнес логикой

        void onAttach(V view);

        void onDetach();

        void onDetachView();
    }
}

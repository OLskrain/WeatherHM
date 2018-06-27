package com.olskrain.weather;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";
    private static final String TEXT = "TEXT";
    private TextView textView;
    private FloatingActionButton fab;
    private Boolean isPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_main);

        String instanceState; //создаем новую переменную для того чтобы посмотреть что у нас в инстанс
        if (savedInstanceState == null) {
            instanceState = "Первый запуск";
        } else {
            instanceState = "Повторный запуск";
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Toasty-внешняя библиотека для вывода различный сообщений(небольших). но не стоит использовать в нормальных проектах
        //Передаем контекст. потом выводим нужное сообщение.и как долго мы хотим его видеть
        Toasty.success(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();

        textView = findViewById(R.id.tv); //обращаемся по id. и и полуили TextView
        fab = findViewById(R.id.fab);

        if (getIntent().getExtras() != null) {
            String text = getIntent().getExtras().getString(TEXT);
            textView.setText("Добрый день, " + text);
        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPressed) {
                    isPressed = true;
                    startNewActivity();
                }
            }
        });

        Log.d(TAG, "onCreate");
    }

    private void startNewActivity() {
        Intent intent = new Intent(this, CreateActionActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isPressed = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}

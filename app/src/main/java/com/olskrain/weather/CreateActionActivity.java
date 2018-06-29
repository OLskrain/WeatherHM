package com.olskrain.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class CreateActionActivity extends AppCompatActivity {

    private static final String TEXT = "TEXT";
    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_action_activity);

        editText = findViewById(R.id.et); //обращаемся к полю во второй активити
    }

    @Override
    public void onBackPressed() {//возврат в предыдущую активити
//        super.onBackPressed();
        Intent intent = new Intent(this, WeatherActivity.class);
        intent.putExtra(TEXT, editText.getText().toString().trim()); //считываем данные
        startActivity(intent);//передаем наш текст в первую активити
        finish();
    }
}

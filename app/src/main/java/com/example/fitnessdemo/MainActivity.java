package com.example.fitnessdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton imageButton = (ImageButton) findViewById(R.id.button);

        imageButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // меняем изображение на кнопке
                if (flag)
                    imageButton.setImageResource(R.drawable.onoff);
                else
                    // возвращаем первую картинку
                    imageButton.setImageResource(R.drawable.onoffg);
                flag = !flag;
            }
        });
    }
}
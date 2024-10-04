package com.example.buttonclicker;

import android.os.Bundle;

import  android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity{
    private Button buttonDisable;
    private Button buttonEnable;
    TextView txtCount;

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCount = (TextView)findViewById(R.id.textView);
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonDisable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonDisable.setEnabled(false);
                count ++;
                txtCount.setText("Kliknięto "+String.valueOf(count)+" razy");
            }


        });
        buttonEnable = findViewById(R.id.buttonEnable);
        buttonEnable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonDisable.setEnabled(true);
            }
        });


    }


}
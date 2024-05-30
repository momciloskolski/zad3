package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvGimnazija;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGimnazija = (TextView) findViewById(R.id.textViewGimnazija);
    }

    public void onClickGimnazija(View view) {
        tvGimnazija.setText(tvGimnazija.getText()+"Odeljnje III5");
    }


    /*public void onClickbutton(View view){
        textView.setText("Odeljenje III-5");
    }*/
}
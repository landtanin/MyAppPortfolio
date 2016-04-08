package com.landtanin.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button B1, B2, B3, B4, B5, B6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();

        buttonController();

    }

    private void buttonController() {

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Movie app", Toast.LENGTH_SHORT).show();

            }
        });


        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Scores app", Toast.LENGTH_SHORT).show();

            }
        });


        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Library app", Toast.LENGTH_SHORT).show();

            }
        });


        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Sunshine android wear app", Toast.LENGTH_SHORT).show();

            }
        });


        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "XYZ Reader app", Toast.LENGTH_SHORT).show();

            }
        });


        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Capstone app", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void bindWidget() {

        B1 = (Button) findViewById(R.id.button1);
        B2 = (Button) findViewById(R.id.button2);
        B3 = (Button) findViewById(R.id.button3);
        B4 = (Button) findViewById(R.id.button4);
        B5 = (Button) findViewById(R.id.button5);
        B6 = (Button) findViewById(R.id.button6);

    }
}

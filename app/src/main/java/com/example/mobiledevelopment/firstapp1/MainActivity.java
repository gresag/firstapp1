package com.example.admin.myapplicationtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button btnClick;
    TextView firstTxt,secondTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClick=(Button) findViewById(R.id.button2);
        firstTxt=(TextView) findViewById(R.id.txt1);
        secondTxt=(TextView) findViewById(R.id.txt2);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTxt.setText("Gresa ka kliku");
            }
        });
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClick=(Button) findViewById(R.id.button1);
        firstTxt=(TextView) findViewById(R.id.txt1);
        secondTxt=(TextView) findViewById(R.id.txt2);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTxt.setText("Gresa ka kliku");
            }
        });
    }

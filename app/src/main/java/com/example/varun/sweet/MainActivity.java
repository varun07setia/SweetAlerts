package com.example.varun.sweet;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {
    Button progress,sucess,warning,error,basic,title,icon;
    SweetAlertDialog sd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress=(Button)findViewById(R.id.progress);
        error=(Button)findViewById(R.id.error);
        warning=(Button)findViewById(R.id.warning);
        basic=(Button)findViewById(R.id.basic);
        sucess=(Button)findViewById(R.id.sucess);
        title=(Button)findViewById(R.id.contenttitle);
        icon=(Button)findViewById(R.id.iconic);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sd=new SweetAlertDialog(MainActivity.this,SweetAlertDialog.PROGRESS_TYPE);
                sd.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                sd.setTitleText("Loading");
                sd.setCancelable(true);
                sd.show();
            }
        });
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this)
                        .setTitleText("Here's a message!")
                        .show();
            }
        });

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this)
                        .setTitleText("Here's a message!")
                        .setContentText("With title")
                        .show();
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Oops...")
                        .setContentText("Something went wrong!")
                        .show();
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Won't be able to recover this file!")
                        .setConfirmText("Yes,delete it!")
                        .show();
            }
        });

        sucess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Good job!")
                        .setContentText("You clicked the button!")
                        .show();
            }
        });

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                        .setTitleText("Sweet!")
                        .setContentText("Here's a custom image.")
                        .setCustomImage(R.drawable.warning_sigh)
                        .show();
            }
        });


    }
    }


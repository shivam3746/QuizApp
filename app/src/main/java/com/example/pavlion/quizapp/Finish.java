package com.example.pavlion.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Finish extends AppCompatActivity {

    public void onClickQuit(View view) {

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    public void onClickplayagain(View view){

        Intent mintent;
        mintent = new Intent(Finish.this, MainActivity.class);
        startActivity(mintent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }
}

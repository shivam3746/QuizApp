package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question6 extends AppCompatActivity {
    Button btn21 = (Button) findViewById(R.id.rd21);
    Button btn22 = (Button) findViewById(R.id.rd22);
    Button btn23 = (Button) findViewById(R.id.rd23);
    Button btn24 = (Button) findViewById(R.id.rd24);

    public void onClickRussia(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn22.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
    }

    public void onClickFrance(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn21.setEnabled(false);
        btn23.setEnabled(false);
        btn24.setEnabled(false);
    }

    public void onClickChina2(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn24.setEnabled(false);
    }

    public void onClickIndia2(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn21.setEnabled(false);
        btn22.setEnabled(false);
        btn23.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question6.this, Question7.class);
        startActivity(mintent);
    }
    }

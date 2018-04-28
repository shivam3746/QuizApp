package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {
    Button btn17 = (Button) findViewById(R.id.rd17);
    Button btn18 = (Button) findViewById(R.id.rd18);
    Button btn19 = (Button) findViewById(R.id.rd19);
    Button btn20 = (Button) findViewById(R.id.rd20);

    public void onClickaugust(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
    }

    public void onClickjuly(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn17.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
    }

    public void onClickdecember(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn20.setEnabled(false);
    }

    public void onClickjune(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question5.this, Question6.class);
        startActivity(mintent);
    }
}

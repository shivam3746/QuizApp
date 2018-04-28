package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question4 extends AppCompatActivity {
    
    Button btn13 = (Button) findViewById(R.id.rd13);
    Button btn14 = (Button) findViewById(R.id.rd14);
    Button btn15 = (Button) findViewById(R.id.rd15);
    Button btn16 = (Button) findViewById(R.id.rd16);


    public void onClickrk(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
    }

    public void onClickjr(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn13.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
    }

    public void onClickym(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn16.setEnabled(false);
    }

    public void onClicklt(View view) {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question4.this, Question5.class);
        startActivity(mintent);
    }
}

package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question9 extends AppCompatActivity {

    public void onClickAntarctica(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd34.setEnabled(false);
        rd35.setEnabled(false);
        rd36.setEnabled(false);
    }

    public void onClickEurope(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd33.setEnabled(false);
        rd35.setEnabled(false);
        rd36.setEnabled(false);
    }

    public void onClickAsia(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd33.setEnabled(false);
        rd34.setEnabled(false);
        rd36.setEnabled(false);
    }

    public void onClickAfrica(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        rd33.setEnabled(false);
        rd34.setEnabled(false);
        rd35.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question9.this, Question10.class);
        startActivity(mintent);
    }
}

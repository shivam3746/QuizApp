package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question8 extends AppCompatActivity {

    public void onClickBrazil(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd30.setEnabled(false);
        rd31.setEnabled(false);
        rd32.setEnabled(false);
    }

    public void onClickIndia(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd29.setEnabled(false);
        rd31.setEnabled(false);
        rd32.setEnabled(false);
    }

    public void onClickCanada(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd29.setEnabled(false);
        rd30.setEnabled(false);
        rd32.setEnabled(false);
    }

    public void onClickChina(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        rd29.setEnabled(false);
        rd30.setEnabled(false);
        rd31.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question8.this, Question9.class);
        startActivity(mintent);
    }
}

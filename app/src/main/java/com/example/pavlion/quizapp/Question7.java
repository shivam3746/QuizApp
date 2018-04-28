package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question7 extends AppCompatActivity {

    public void onClickrugby(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd26.setEnabled(false);
        rd27.setEnabled(false);
        rd28.setEnabled(false);
    }

    public void onClickicehockey(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        rd25.setEnabled(false);
        rd27.setEnabled(false);
        rd28.setEnabled(false);
    }

    public void onClickfootball(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd25.setEnabled(false);
        rd26.setEnabled(false);
        rd28.setEnabled(false);
    }

    public void onClickcricket(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        rd25.setEnabled(false);
        rd26.setEnabled(false);
        rd27.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question7.this, Question8.class);
        startActivity(mintent);
    }
}

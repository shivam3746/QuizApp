package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {
    Button btn9 = (Button) findViewById(R.id.rd9);
    Button btn10 = (Button) findViewById(R.id.rd10);
    Button btn11 = (Button) findViewById(R.id.rd11);
    Button btn12 = (Button) findViewById(R.id.rd12);

    public void onClickBarcelona(View view) {
        Toast.makeText(this, "Wrong! Try Better luck next time", Toast.LENGTH_SHORT).show();
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
    }

    public void onClickMadrid(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn9.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
    }

    public void onClickMalaga(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn12.setEnabled(false);
    }

    public void onClickSeville(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question3.this, Question4.class);
        startActivity(mintent);
    }
}

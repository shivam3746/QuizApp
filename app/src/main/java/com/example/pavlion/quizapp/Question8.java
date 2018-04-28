package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question8 extends AppCompatActivity {
    Button btn29 = (Button) findViewById(R.id.rd29);
    Button btn30 = (Button) findViewById(R.id.rd30);
    Button btn31 = (Button) findViewById(R.id.rd31);
    Button btn32 = (Button) findViewById(R.id.rd32);

    public void onClickBrazil(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn30.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
    }

    public void onClickIndia(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn29.setEnabled(false);
        btn31.setEnabled(false);
        btn32.setEnabled(false);
    }

    public void onClickCanada(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn29.setEnabled(false);
        btn30.setEnabled(false);
        btn32.setEnabled(false);
    }

    public void onClickChina(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn29.setEnabled(false);
        btn30.setEnabled(false);
        btn31.setEnabled(false);
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

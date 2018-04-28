package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Question10 extends AppCompatActivity {
    Button btn37 = (Button) findViewById(R.id.rd37);
    Button btn38 = (Button) findViewById(R.id.rd38);
    Button btn39 = (Button) findViewById(R.id.rd39);
    Button btn40 = (Button) findViewById(R.id.rd40);

    public void onClickobama(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn38.setEnabled(false);
        btn39.setEnabled(false);
        btn40.setEnabled(false);
    }

    public void onClickbclinton(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn37.setEnabled(false);
        btn39.setEnabled(false);
        btn40.setEnabled(false);
    }

    public void onClickhclinton(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn37.setEnabled(false);
        btn38.setEnabled(false);
        btn40.setEnabled(false);
    }

    public void onClicktrump(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn37.setEnabled(false);
        btn38.setEnabled(false);
        btn39.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Question10.this, Finish.class);
        startActivity(mintent);
    }
}

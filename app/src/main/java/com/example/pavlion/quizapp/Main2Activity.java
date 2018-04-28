package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    
    Button btn5 = (Button) findViewById(R.id.rd5);
    Button btn6 = (Button) findViewById(R.id.rd6);
    Button btn7 = (Button) findViewById(R.id.rd7);
    Button btn8 = (Button) findViewById(R.id.rd8);

    public void onClick1994(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
    }

    public void onClick1956(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn5.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
    }

    public void onClick2006(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn8.setEnabled(false);
    }

    public void onClick1998(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(Main2Activity.this, Question3.class);
        startActivity(mintent);
    }
}

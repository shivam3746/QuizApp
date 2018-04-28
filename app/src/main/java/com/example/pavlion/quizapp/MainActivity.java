package com.example.pavlion.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1 = (Button) findViewById(R.id.rd1);
    Button btn2 = (Button) findViewById(R.id.rd2);
    Button btn3 = (Button) findViewById(R.id.rd3);
    Button btn4 = (Button) findViewById(R.id.rd4);

    public void onClickNewDelhi(View view) {
        Toast.makeText(this, "Correct! Well Done", Toast.LENGTH_SHORT).show();
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
    }

    public void onClickBengaluru(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn1.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
    }

    public void onClickMumbai(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn4.setEnabled(false);
    }

    public void onClickKolkata(View view) {
        Toast.makeText(this, "Wrong! Better luck next time", Toast.LENGTH_SHORT).show();
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickNext(View view){
        Intent mintent;
        mintent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(mintent);
    }

}



package com.example.simplesave;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static int budget;
    public static int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_info);
    }

    public void next(View view) {
        budget = Integer.parseInt(((EditText)findViewById(R.id.budget)).getText().toString());
        time = Integer.parseInt(((EditText)findViewById(R.id.time)).getText().toString());

        Intent intent = new Intent(this, TransactionsActivity.class);
        startActivity(intent);
    }
}
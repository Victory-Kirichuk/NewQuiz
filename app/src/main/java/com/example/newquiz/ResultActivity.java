package com.example.newquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView t, c, w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t = (TextView) findViewById(R.id.total);
        c = (TextView) findViewById(R.id.correct);
        w = (TextView) findViewById(R.id.wrong);

        Intent i = getIntent();
        String questions = i.getStringExtra("total");
        String correct= i.getStringExtra("correct");
        String wrong = i.getStringExtra("incorrect");
        t.setText(questions);
        c.setText(correct);
        w.setText(wrong);
    }
}

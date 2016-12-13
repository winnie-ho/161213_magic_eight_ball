package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class AnswerActivity extends AppCompatActivity {
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("EightBall", "AnswerActivity.onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = (TextView)findViewById(R.id.answer_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        answerText.setText(answer);
    }
}

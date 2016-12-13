package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */

public class EightBall extends AppCompatActivity {
    EditText questionEditText;
    Button shakeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState ) {

        Log.d("EightBall", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText=(EditText)findViewById(R.id.question_text);
        shakeButton=(Button)findViewById((R.id.shake_button));

        shakeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("EightBall", "Shake button clicked");
                String question = questionEditText.getText().toString();
                Log.d("EightBall", "Question:" + question);
                Answer answer = new Answer();
                String randomAnswer = answer.getAnswer();

                Intent intent = new Intent(EightBall.this, AnswerActivity.class);
                intent.putExtra("answer",randomAnswer);
                startActivity(intent);
            }
        });
    }
}

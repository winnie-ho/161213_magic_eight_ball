package com.example.user.eightball;

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
    TextView answerText;
    Button shakeButton;
    Answer answer = new Answer();

    @Override
    protected void onCreate(Bundle savedInstanceState ) {

        Log.d("EightBall", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText=(EditText)findViewById(R.id.question_text);
        answerText=(TextView)findViewById(R.id.answer_text);
        shakeButton=(Button)findViewById((R.id.shake_button));

        shakeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("EightBall", "Shake button clicked");
                String question = questionEditText.getText().toString();
                Log.d("EightBall", "Question:" + question);
                answerText.setText(answer.getAnswer());
            }
        });
    }
}

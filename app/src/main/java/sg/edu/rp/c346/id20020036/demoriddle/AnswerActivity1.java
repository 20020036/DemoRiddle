package sg.edu.rp.c346.id20020036.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textViewAnswer);
        tvAnswer.setText("In Second Activity");
        Intent receiveIntent = getIntent();
        String questionsSelected = receiveIntent.getStringExtra("Question");
        tvAnswer.setText(questionsSelected + " answer is: Queue");
        /*if(questionsSelected.equalsIgnoreCase("q1"))
        {
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        }
        else
        {
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }*/
    }
}
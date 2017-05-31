package com.example.viswaguru.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView ;

import static java.sql.Types.INTEGER;

public class QuizPage extends AppCompatActivity {
    public String question1 = "who lives in a pineapple under the sea" ;
    public String answer1 = "spongebob";
   public String answer2 = "me" ;
   Question q1 = new Question ("who lives in a pineapple under the sea",   answer1 ,"sponge", 5 ) ;
   Question q2 = new Question ("who lives in a rock",   answer2 ,"sponge", 5 ) ;
    Question [] array1 = {q1, q2};





    TextView pregunta ;
     int score = 0 ;
     TextView playerscore ;
     int index = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        pregunta = (TextView) findViewById(R.id.textView3) ;

        playerscore = (TextView) findViewById(R.id.PlayerScore) ;

        Button buzz = (Button) findViewById(R.id.button4);
        EditText Answer =  (EditText) findViewById(R.id.editText) ;

       final  String userAnswer = Answer.getText().toString() ;


        buzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index<=array1.length-1){
                    pregunta.setText((array1[index+1]).getQ()) ;
                }
                else
                    index = 0 ;
               boolean kappa = array1[index].tierneybuzz(choose.p1.getFactor());
                if (kappa == true) {
                    score = score + array1[index].qCheck(userAnswer, 5);

                    playerscore.setText(Integer.toString(score));
                }
                else {
                    score = 0;
                    playerscore.setText(("you are a failure in life"));
                }
            }
        });
        Button Read = (Button) findViewById(R.id.button5);
        Read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pregunta.setText(q1.getQ());

            }
        });


    }
}


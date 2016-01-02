package com.example.nishant.sum_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SumTwoNumbers extends AppCompatActivity {
    static int toggle =0;

    //public TextView ans = (TextView)findViewById(R.id.ans);
    //How can we include the above line and delete the ones in the method.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_two_numbers);
        //Initiates with a set of numbers
        Button button_go = (Button)findViewById(R.id.button_go);
        onNextButtonClick(button_go);
    }

    // Numeric pad sends data to the User Ans
    public void onNumericPadClick(View v){
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        Button buttonClicked = (Button)v;
        String buttonStored = buttonClicked.getText().toString();
        user_ans.append(buttonStored);
    }

    //Click to clear all in User input
    public void onCAButtonClick(View v){
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        user_ans.setText("");
    }

    //Click to backspace one character in user input
    public void onDeleteButtonClick(View v){
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        String answer = user_ans.getText().toString();
        if (answer.length() > 0) {
            answer = answer.substring(0, answer.length()-1);
        }
        user_ans.setText(answer);
    }

    //Checking if the answer is correct or not and displays the result
    public void onCheckButtonClick(View v){
        TextView num1 = (TextView)findViewById(R.id.textView_num1);
        TextView num2 = (TextView)findViewById(R.id.textView_num2);
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        TextView ans = (TextView)findViewById(R.id.ans);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int userAnswer = Integer.parseInt(user_ans.getText().toString());
        int sum = number1 * number2;
        if (userAnswer == sum) {
            ans.setText("Correct");
        }
        else {
            ans.setText("Incorrect");
        }
    }

    //setting up for the next iteration generating random numbers
    public void onNextButtonClick(View v){
        // Generating random numbers below
        Random rand1 = new Random();
        Random rand2 = new Random();
        int number1  = rand1.nextInt(10)+1;
        int number2 = rand2.nextInt(10)+1;
        //---
        TextView num1 = (TextView)findViewById(R.id.textView_num1);
        TextView num2 = (TextView)findViewById(R.id.textView_num2);
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        TextView ans = (TextView)findViewById(R.id.ans);
        num1.setText(Integer.toString(number1));
        num2.setText(Integer.toString(number2));
        user_ans.setText("");
        ans.setText("");
    }

    //one button "Go" to both check answers and generate next number
    public void onGoButtonClick(View v){
      //  TextView test = (TextView)findViewById(R.id.textView_test);
        TextView user_ans = (TextView)findViewById(R.id.textView_userAns);
        TextView num1 = (TextView)findViewById(R.id.textView_num1);
        TextView num2 = (TextView)findViewById(R.id.textView_num2);
        TextView ans = (TextView)findViewById(R.id.ans);
        //toggle = toggle + 1;
        //test.setText(Integer.toString(toggle));
        if (ans.getText().toString().length() < 1 && user_ans.getText().toString().length() > 0
                && num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
            onCheckButtonClick(v);
        }
        else {
            onNextButtonClick(v);
        }


    }
}

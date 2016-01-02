package com.example.nishant.sum_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SumTwoNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_two_numbers);
    }

    public void onAddButtonClick(View v){
        EditText num1 = (EditText)findViewById(R.id.editText_num1);
        EditText num2 = (EditText)findViewById(R.id.editText_num2);
        EditText user_ans = (EditText)findViewById(R.id.editText_userAns);
        TextView ans = (TextView)findViewById(R.id.ans);
        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int userAnswer = Integer.parseInt(user_ans.getText().toString());
        int sum = number1 + number2;
        Random
        if (userAnswer == sum) {
            ans.setText("Correct");
        }
        else {
            ans.setText("Incorrect");
        }
    }
}

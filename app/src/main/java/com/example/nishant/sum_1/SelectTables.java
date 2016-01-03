package com.example.nishant.sum_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class SelectTables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tables);
    }

    // Pass on the gathered data to the Main class
    public void onSelectButttonClick(View v){
        Spinner from1 = (Spinner)findViewById(R.id.spinner_from1);
        Spinner from2 = (Spinner)findViewById(R.id.spinner_from2);
        Spinner to1 = (Spinner)findViewById(R.id.spinner_to1);
        Spinner to2 = (Spinner)findViewById(R.id.spinner_to2);
        String dataFrom1 = from1.getSelectedItem().toString();
        String dataFrom2 = from2.getSelectedItem().toString();
        String dataTo1 = to1.getSelectedItem().toString();
        String dataTo2 = to2.getSelectedItem().toString();
        Intent i = new Intent(this,SumTwoNumbers.class);
        i.putExtra("from1",dataFrom1);
        i.putExtra("from2",dataFrom2);
        i.putExtra("to1",dataTo1);
        i.putExtra("to2",dataTo2);
        startActivity(i);
    }
}

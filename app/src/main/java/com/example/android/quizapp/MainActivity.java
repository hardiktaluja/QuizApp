package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        //Find all the views
        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        RadioGroup q1RadioGroup = (RadioGroup) findViewById(R.id.q1_radio_group);
        RadioGroup q2RadioGroup = (RadioGroup) findViewById(R.id.q2_radio_group);
        CheckBox q3a1 = (CheckBox) findViewById(R.id.q3_a1);
        CheckBox q3a2 = (CheckBox) findViewById(R.id.q3_a2);
        CheckBox q3a3 = (CheckBox) findViewById(R.id.q3_a3);
        CheckBox q3a4 = (CheckBox) findViewById(R.id.q3_a4);
        RadioGroup q4RadioGroup = (RadioGroup) findViewById(R.id.q4_radio_group);
        EditText q5EditText = (EditText) findViewById(R.id.q5_edit_text);
        EditText q6EditText = (EditText) findViewById(R.id.q6_edit_text);
        RadioGroup q7RadioGroup = (RadioGroup) findViewById(R.id.q7_radio_group);
        RadioGroup q8RadioGroup = (RadioGroup) findViewById(R.id.q8_radio_group);
        CheckBox q9a1 = (CheckBox) findViewById(R.id.q9_a1);
        CheckBox q9a2 = (CheckBox) findViewById(R.id.q9_a2);
        CheckBox q9a3 = (CheckBox) findViewById(R.id.q9_a3);
        CheckBox q9a4 = (CheckBox) findViewById(R.id.q9_a4);
        RadioGroup q10RadioGroup = (RadioGroup) findViewById(R.id.q10_radio_group);

        //Get the values of all views
        String name = nameEditText.getText().toString();
        int a1 = q1RadioGroup.getCheckedRadioButtonId();
        int a2 = q2RadioGroup.getCheckedRadioButtonId();
        boolean a31 = q3a1.isChecked();
        boolean a32 = q3a2.isChecked();
        boolean a33 = q3a3.isChecked();
        boolean a34 = q3a4.isChecked();
        int a4 = q4RadioGroup.getCheckedRadioButtonId();
        String a5 = q5EditText.getText().toString();
        String a6 = q6EditText.getText().toString();
        int a7 = q7RadioGroup.getCheckedRadioButtonId();
        int a8 = q8RadioGroup.getCheckedRadioButtonId();
        boolean a91 = q9a1.isChecked();
        boolean a92 = q9a2.isChecked();
        boolean a93 = q9a3.isChecked();
        boolean a94 = q9a4.isChecked();
        int a10 = q10RadioGroup.getCheckedRadioButtonId();

        //Check the answers and calculate score
        if (a1 == R.id.a1) score += 1;
        if (a2 == R.id.a2) score += 1;
        if (a31 && a32 && !a33 && a34) score += 1;
        if (a4 == R.id.a4) score += 1;
        if (a5.equals("V") || a5.equals("v")) score += 1;
        if (a6.equals("7")) score += 1;
        if (a7 == R.id.a7) score += 1;
        if (a8 == R.id.a8) score += 1;
        if (a91 && a92 && !a93 && a94) score += 1;
        if (a10 == R.id.a10) score += 1;

        //Toast Message
        String message = "Hello " + name;
        message += "\nYour score is " + score;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        score = 0;
    }
}

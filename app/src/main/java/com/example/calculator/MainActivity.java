package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAddition(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String number = myTextField.getText().toString();
        int n1 = Integer.valueOf(number);

        myTextField = (EditText) findViewById(R.id.numberTwo);
        number = myTextField.getText().toString();
        int n2 = Integer.valueOf(number);

        goToActivity2(String.valueOf(n1 + n2));
    }

    public void clickSubtraction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String number = myTextField.getText().toString();
        int n1 = Integer.valueOf(number);

        myTextField = (EditText) findViewById(R.id.numberTwo);
        number = myTextField.getText().toString();
        int n2 = Integer.valueOf(number);

        goToActivity2(String.valueOf(n1 - n2));
    }

    public void clickMultiplication(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String number = myTextField.getText().toString();
        int n1 = Integer.valueOf(number);

        myTextField = (EditText) findViewById(R.id.numberTwo);
        number = myTextField.getText().toString();
        int n2 = Integer.valueOf(number);

        goToActivity2(String.valueOf(n1 * n2));
    }

    public void clickDivision(View view) {
        EditText myTextField = (EditText) findViewById(R.id.numberOne);
        String number = myTextField.getText().toString();
        int n1 = Integer.valueOf(number);

        myTextField = (EditText) findViewById(R.id.numberTwo);
        number = myTextField.getText().toString();
        int n2 = Integer.valueOf(number);

        goToActivity2(String.valueOf(n1 / n2));
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
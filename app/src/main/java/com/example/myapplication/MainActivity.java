package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);.
        setContentView(R.layout.activity_main);
        EditText e1=(EditText)findViewById(R.id.ed1);
        EditText e2=(EditText)findViewById(R.id.editTextTextEmailAddress);
        EditText e3=(EditText)findViewById(R.id.editTextTextPassword);
        EditText e4=(EditText)findViewById(R.id.editTextPhone);
        Button b1=(Button)findViewById(R.id.button2);
        NumberPicker np = findViewById(R.id.numberPicker);

        np.setMinValue(18);
        np.setMaxValue(100);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailValidator(e2);

            }
        });
    }
    public void emailValidator(EditText etMail) {

        String emailToText = etMail.getText().toString();

        if (!emailToText.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailToText).matches()) {
            return;
        } else {
            Toast.makeText(this, "Enter valid Email address !", Toast.LENGTH_SHORT).show();
        }
    }

}
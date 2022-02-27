package com.example.launchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstnameDisplayText, lastnameDisplayText, emailDisplayText;
    private EditText firstnameInputTextArea, lastnameInputTextArea, emailInputTextArea;
    private Button changeTextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //text views
        this.firstnameDisplayText = findViewById(R.id.firstnameTextView);
        this.lastnameDisplayText = findViewById(R.id.lastnameTextView);
        this.emailDisplayText = findViewById(R.id.emailTextView);
        //input text areas
        this.firstnameInputTextArea = findViewById(R.id.firstnameTextArea);
        this.lastnameInputTextArea = findViewById(R.id.lastnameTextArea);
        this.emailInputTextArea = findViewById(R.id.emailTextArea);
        //button
        this.changeTextButton = findViewById(R.id.button);
    }

    public void changeTextView(View view) {
        //create messages by getting the text areas values
        String fnMessage = "First Name: " + firstnameInputTextArea.getText().toString();
        String lnMessage = "Last Name: " + lastnameInputTextArea.getText().toString();
        String emailMessage = "Email: " + emailInputTextArea.getText().toString();

        this.firstnameDisplayText.setText(fnMessage);
        this.lastnameDisplayText.setText(lnMessage);
        this.emailDisplayText.setText(emailMessage);

    }

}
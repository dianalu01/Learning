package com.diana.myfirstapplicationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText userField = (EditText) this.findViewById(R.id.textField);
        EditText passwordField = (EditText) this.findViewById(R.id.passwordField);

        String message = "Button Tapped Usuario: " + userField.getText().toString() +
                " Password: " + passwordField.getText().toString();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
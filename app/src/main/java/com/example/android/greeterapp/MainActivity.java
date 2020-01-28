package com.example.android.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText nameField = (EditText) findViewById(R.id.name_field);
         Button button = (Button) findViewById(R.id.greeter);
         final TextView textView = (TextView) findViewById(R.id.hello);

        button.setOnClickListener(new Button.OnClickListener() {

    public void onClick (View v) {

        String name = nameField.getText().toString();
        textView.setText("Hello, " + name);
       // textView.setText("Hello, " + nameField);

        Toast toast= Toast.makeText(getApplicationContext(), "Welcome to Greeter App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

                    }
                }


        );
    }
}




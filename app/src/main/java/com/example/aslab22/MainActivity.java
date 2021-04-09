package com.example.aslab22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public EditText Height;
    public EditText Weight;
    public EditText Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Height = (EditText)findViewById(R.id.editTextNumberHeight);
        Weight = (EditText)findViewById(R.id.editTextNumberWeight);
        Age = (EditText)findViewById(R.id.editTextNumberAge);
    }
    public void cls(View v)
    {
        Height.setText("");
        Weight.setText("");
        Age.setText("");
    }
}
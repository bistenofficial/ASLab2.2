package com.example.aslab22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText Height;
    public EditText Weight;
    public EditText Age;
    public ImageButton Male;
    public ImageButton Female;
    public TextView defBMR;
    int tf = 10;
    double ageInt,weightInt,heightInt,solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Height = (EditText)findViewById(R.id.editTextNumberHeight);
        Weight = (EditText)findViewById(R.id.editTextNumberWeight);
        Age = (EditText)findViewById(R.id.editTextNumberAge);
        Male = (ImageButton)findViewById(R.id.imageButtonMale);
        Female = (ImageButton)findViewById(R.id.imageButtonFemale);
        defBMR = (TextView)findViewById(R.id.textViewDefBMR);
    }
    public void cls(View v)
    {
        Height.setText("");
        Weight.setText("");
        Age.setText("");
    }
    public void math (View v)
    {
        Toast toast;
        switch (v.getId()) {
            case R.id.buttonMath:
                ageInt = Double.parseDouble(Age.getText().toString());
                weightInt = Double.parseDouble(Height.getText().toString());
                heightInt = Double.parseDouble(Weight.getText().toString());
                if(tf==10) {
                    toast = Toast.makeText(this, "Выберите пол", Toast.LENGTH_LONG);
                    toast.show();
                }
                else
                    {if (tf == 1) {
                        solve = (66 + (13.7 * weightInt) + (5 * heightInt) - (6.8 * ageInt));
                    } else {
                        solve = (655 + (9.6 * weightInt) + (1.8 * heightInt) - (4.7 * ageInt));
                    }
                        defBMR.setText(Double.toString(solve));
                }
                break;
            default:
                break;
        }
    }
    public void select(View v)
    {
        switch (v.getId()) {
            case R.id.imageButtonMale:
                Male.setBackgroundColor(Color.GRAY);
                tf = 1;
                Female.setBackgroundColor(Color.WHITE);
                break;
            case R.id.imageButtonFemale:
                Female.setBackgroundColor(Color.GRAY);
                tf = 0;
                Male.setBackgroundColor(Color.WHITE);
                break;
            default:
                break;
        }
    }
}
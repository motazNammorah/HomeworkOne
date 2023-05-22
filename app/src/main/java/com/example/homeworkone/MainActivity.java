package com.example.homeworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText FirstName;
    private EditText LastName;
    private EditText Age;
    private EditText Nationality;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstName=findViewById(R.id.FirstName);
        LastName=findViewById(R.id.LastName);
        Age=findViewById(R.id.Age);
        Nationality =findViewById(R.id.Nationality);
        Password=findViewById(R.id.Password);


    }

    public void ClickOnClick(View view) {
      String firstname= FirstName.getText().toString();
        Toast.makeText(this,firstname, Toast.LENGTH_SHORT).show();

        String lastname =LastName.getText().toString();
        Toast.makeText(this,lastname, Toast.LENGTH_SHORT).show();

        String age=Age.getText().toString();
        Toast.makeText(this,age, Toast.LENGTH_SHORT).show();

        String nationality=Nationality.getText().toString();
        Toast.makeText(this,nationality, Toast.LENGTH_SHORT).show();

        String password= Password.getText().toString();




    }
}
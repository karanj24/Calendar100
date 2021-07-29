package com.headlit.android.calendar100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String Yr="get_year";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitYear(View view) {

        Intent intent=new Intent(this, MonthActivity.class);
        EditText num=findViewById(R.id.editTextNumber);
        String year=num.getText().toString();
        int temp=Integer.parseInt(year);
        if(temp>2100 || temp<2001){
            Toast.makeText(this, "Please enter the year in range of 2001 to 2100", Toast.LENGTH_LONG).show();
        }
        else {
            intent.putExtra(Yr, year);
            startActivity(intent);
        }
    }
}
package com.headlit.android.calendar100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DateActivity extends AppCompatActivity {

    public static final String DATE="get_date";
    public static final String YYEAR="get_year";
    public static final String MONTH="get_month";
    public static final String MONT="get_mon";
    public int date;
    public int year;
    public int month;
    public String mon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        Intent intent=getIntent();
        mon=intent.getStringExtra(MonthActivity.MON);
        month=intent.getIntExtra(MonthActivity.MONTH,0);
        year=intent.getIntExtra(MonthActivity.YEAR,0);
        Toast.makeText(this, year+" is passed again", Toast.LENGTH_LONG).show();

    }


    public void submitDate(View view) {

        EditText editText1=findViewById(R.id.editTextNumber1);
        date=Integer.parseInt(editText1.getText().toString());

        if(date<1){
            Toast.makeText(this, "Please enter the valid date", Toast.LENGTH_LONG).show();
        }
        else{
            if(mon.equals("January") || mon.equals("July") || mon.equals("March") || mon.equals("May")
                    || mon.equals("August") || mon.equals("October") || mon.equals("December")){
                if(date>31){
                    Toast.makeText(this, "Date cannot be more than 31 in "+mon+" month", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent1=new Intent(this, ResultActivity.class);
                    intent1.putExtra(MONT,month);
                    intent1.putExtra(MONTH, mon);
                    intent1.putExtra(DATE, date);
                    intent1.putExtra(YYEAR,year);
                    startActivity(intent1);
                }
            }
            else if(mon.equals("April") || mon.equals("June") || mon.equals("September") || mon.equals("November")){
                if(date>30){
                    Toast.makeText(this, "Date cannot be more than 30 in "+mon+" month", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent1=new Intent(this, ResultActivity.class);
                    intent1.putExtra(MONT,month);
                    intent1.putExtra(MONTH, mon);
                    intent1.putExtra(DATE, date);
                    intent1.putExtra(YYEAR,year);
                    startActivity(intent1);
                }
            }
            else{
                if(year%4==0 && year%100!=0){
                    if(date>29){
                        Toast.makeText(this, "In Leap year date cannot be more than 29 in "+mon+" month", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Intent intent1=new Intent(this, ResultActivity.class);
                        intent1.putExtra(MONT,month);
                        intent1.putExtra(MONTH, mon);
                        intent1.putExtra(DATE, date);
                        intent1.putExtra(YYEAR,year);
                        startActivity(intent1);
                    }
                }
                else {
                    if(date>28){
                        Toast.makeText(this, "Date cannot be more than 28 in "+mon+" month", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Intent intent1=new Intent(this, ResultActivity.class);
                        intent1.putExtra(MONT,month);
                        intent1.putExtra(MONTH, mon);
                        intent1.putExtra(DATE, date);
                        intent1.putExtra(YYEAR,year);
                        startActivity(intent1);
                    }
                }
            }
        }
    }
}
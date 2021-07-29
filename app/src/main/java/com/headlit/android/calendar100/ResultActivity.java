
package com.headlit.android.calendar100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        int year=intent.getIntExtra(DateActivity.YYEAR, 0);
        String month=intent.getStringExtra(DateActivity.MONTH);
        int mon=intent.getIntExtra(DateActivity.MONT,0);
        int date=intent.getIntExtra(DateActivity.DATE, 0);
        int result = (date+mon-1)%7;
        String message;

        switch (result){
            case 0:
                message= "There will be Sunday on "+date+" "+month+" "+year;
                break;
            case 1:
                message= "There will be Monday on "+date+" "+month+" "+year;
                break;
            case 2:
                message="There will be Tuesday on "+date+" "+month+" "+year;
                break;
            case 3:
                message= "There will be Wednesday on "+date+" "+month+" "+year;
                break;
            case 4:
                message= "There will be Thursday on "+date+" "+month+" "+year;
                break;
            case 5:
                message= "There will be Friday on "+date+" "+month+" "+year;
                break;
            case 6:
                message= "There will be Saturday on "+date+" "+month+" "+year;
                break;
            default:
                message="Something Went wrong!";
        }

        TextView textView=findViewById(R.id.textView4);
        textView.setText(message);

    }
}

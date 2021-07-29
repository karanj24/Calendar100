package com.headlit.android.calendar100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MonthActivity extends AppCompatActivity {

    public static final String MONTH="get_month";
    public static final String YEAR="get_yr";
    public static final String MON="get_mon";
    public int year;
    public int temp,mod;
    //public static String st="ABCKFGAIDEFNBCDLGABJEFGHDEM";
    public int arr[]=new int[12];
    public int A[]={1, 4, 4, 7, 2, 5, 7, 3, 6, 1, 4, 6};
    public int B[]={2, 5, 5, 1, 3, 6, 1, 4, 7, 2, 5, 7};
    public int C[]={3, 6, 6, 2, 4, 7, 2, 5, 1, 3, 6, 1};
    public int D[]={4, 7, 7, 3, 5, 1, 3, 6, 2, 4, 7, 2};
    public int E[]={5, 1, 1, 4, 6, 2, 4, 7, 3, 5, 1, 3};
    public int F[]={6, 2, 2, 5, 7, 3, 5, 1, 4, 6, 2, 4};
    public int G[]={7, 3, 3, 6, 1, 4, 6, 2, 5, 7, 3, 5};
    public int H[]={1, 4, 5, 1, 3, 6, 1, 4, 7, 2, 5, 7};
    public int I[]={2, 5, 6, 2, 4, 7, 2, 5, 1, 3, 6, 1};
    public int J[]={3, 6, 7, 3, 5, 1, 3, 6, 2, 4, 7, 2};
    public int K[]={4, 7, 1, 4, 6, 2, 4, 7, 3, 5, 1, 3};
    public int L[]={5, 1, 2, 5, 7, 3, 5, 1, 4, 6, 2, 4};
    public int M[]={6, 2, 3, 6, 1, 4, 6, 2, 5, 7, 3, 5};
    public int N[]={7, 3, 4, 7, 2, 5, 7, 3, 6, 1, 4, 6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        Intent intent = getIntent();
        year = Integer.parseInt(intent.getStringExtra(MainActivity.Yr));


        Toast.makeText(this, year+" is passed", Toast.LENGTH_LONG).show();

        if(year==2100){
            System.arraycopy(E, 0, arr, 0, 12);
        }

        else {

            temp = year - 2001;
            mod = temp % 28;

            if (mod == 0 || mod == 6 || mod == 17) {
                System.arraycopy(A, 0, arr, 0, 12);
            }

            if (mod == 1 || mod == 12 || mod == 18) {
                System.arraycopy(B, 0, arr, 0, 12);
            }

            if (mod == 2 || mod == 13 || mod == 24) {
                System.arraycopy(C, 0, arr, 0, 12);
            }

            if (mod == 8 || mod == 14 || mod == 25) {
                System.arraycopy(D, 0, arr, 0, 12);
            }

            if (mod == 9 || mod == 20 || mod == 26) {
                System.arraycopy(E, 0, arr, 0, 12);
            }

            if (mod == 4 || mod == 10 || mod == 21) {
                System.arraycopy(F, 0, arr, 0, 12);
            }

            if (mod == 5 || mod == 16 || mod == 22) {
                System.arraycopy(G, 0, arr, 0, 12);
            }

            if (mod == 3) {
                System.arraycopy(K, 0, arr, 0, 12);
            }

            if (mod == 15) {
                System.arraycopy(L, 0, arr, 0, 12);
            }

            if (mod == 27) {
                System.arraycopy(M, 0, arr, 0, 12);
            }

            if (mod == 11) {
                System.arraycopy(N, 0, arr, 0, 12);
            }

            if (mod == 23) {
                System.arraycopy(H, 0, arr, 0, 12);
            }

            if (mod == 7) {
                System.arraycopy(I, 0, arr, 0, 12);
            }

            if (mod == 19) {
                System.arraycopy(J, 0, arr, 0, 12);
            }

        }

    }

    public void submitMonth1(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=0;
        String mon="January";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);

    }

    public void submitMonth2(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=1;
        String mon="February";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth3(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=2;
        String mon="March";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth4(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=3;
        String mon="April";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth5(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=4;
        String mon="May";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth6(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=5;
        String mon="June";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth7(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=6;
        String mon="July";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth8(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=7;
        String mon="August";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth9(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=8;
        String mon="September";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth10(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=9;
        String mon="October";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth11(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=10;
        String mon="November";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }

    public void submitMonth12(View view) {
        Intent intent1 = new Intent(this, DateActivity.class);
        int m=11;
        String mon="December";
        intent1.putExtra(MON,mon);
        intent1.putExtra(YEAR,year);
        intent1.putExtra(MONTH,arr[m]);
        startActivity(intent1);
    }
}
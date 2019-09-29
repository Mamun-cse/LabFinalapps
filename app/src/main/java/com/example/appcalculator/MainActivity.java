package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Bpoint,Bequ,Badd,Bsub,Bmul,Bdiv,Bmod,BAC,BDEL,Broot;
    boolean add,sub,mul,div,mod;
    double var1,var2;
    TextView text,ans;
    String del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
        B5 = findViewById(R.id.b5);
        B6 = findViewById(R.id.b6);
        B7 = findViewById(R.id.b7);
        B8 = findViewById(R.id.b8);
        B9 = findViewById(R.id.b9);
        B0 = findViewById(R.id.bzero);
        Bpoint = findViewById(R.id.bpoint);
        Bequ = findViewById(R.id.bequ);
        Badd = findViewById(R.id.badd);
        Bsub = findViewById(R.id.bsub);
        Bmul = findViewById(R.id.bmul);
        Bdiv = findViewById(R.id.bdiv);
        Bmod = findViewById(R.id.bmod);
        Broot = findViewById(R.id.broot);
        BAC = findViewById(R.id.bAC);
        BDEL = findViewById(R.id.bDEL);
        text = findViewById(R.id.bcontent);
        ans = findViewById(R.id.bresult);

    }
}

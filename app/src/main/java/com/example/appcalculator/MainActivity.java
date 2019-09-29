package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

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

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");
            }
        });
        Bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });
        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else {
                    var1=Double.parseDouble(text.getText()+"");
                    add=true;
                    text.setText(null);
                }

            }
        });
        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    sub=true;
                    text.setText(null);
                }

            }
        });
        Bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    mul=true;
                    text.setText(null);
                }

            }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    div=true;
                    text.setText(null);
                }

            }
        });
        Bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    mod=true;
                    text.setText(null);
                }

            }
        });
        BAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(null);
                ans.setText(null);
            }
        });
        BDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del=text.getText().toString();
                del=del.substring(0,del.length()-1);
                text.setText(del+"");

            }
        });
        Broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){
                    text.setText("");
                }
                else{
                    var1=Double.parseDouble(text.getText()+"");
                    var2=sqrt(var1);
                    ans.setText(var2+"");
                }

            }
        });

        Bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans.setText("error");

                    }
                    else{
                        ans.setText(var1%var2+"");
                        mod=false;
                    }
                }
            }

        });


    }
}

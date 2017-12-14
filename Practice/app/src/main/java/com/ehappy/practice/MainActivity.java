package com.ehappy.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtShow;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnstar,btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtShow=(TextView)findViewById(R.id.PhoneText);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnstar=(Button)findViewById(R.id.btnstar);
        btnclear=(Button)findViewById((R.id.btnclear));

        btn1.setOnClickListener(Mylistener);
        btn2.setOnClickListener(Mylistener);
        btn3.setOnClickListener(Mylistener);
        btn4.setOnClickListener(Mylistener);
        btn5.setOnClickListener(Mylistener);
        btn6.setOnClickListener(Mylistener);
        btn7.setOnClickListener(Mylistener);
        btn8.setOnClickListener(Mylistener);
        btn9.setOnClickListener(Mylistener);
        btn0.setOnClickListener(Mylistener);
        btnstar.setOnClickListener(Mylistener);
        btnclear.setOnClickListener(Mylistener2);
    }

    private Button.OnClickListener Mylistener=
            new Button.OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    Button btn=(Button)v;
                    String s=txtShow.getText().toString();

                    txtShow.setText(s+btn.getText());
                }
            };
    private Button.OnClickListener Mylistener2=
            new Button.OnClickListener(){
            @Override
                public void onClick(View v)
            {
                txtShow.setText("電話號碼：");
            }
    };
}

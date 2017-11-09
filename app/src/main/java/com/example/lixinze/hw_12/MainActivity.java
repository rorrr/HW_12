package com.example.lixinze.hw_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button button;
    EditText t1;
    EditText t2;
    int r1;
    int r2;
    String r3="";
    String r4="";
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HW12(View v) {
        tv=(TextView) this.findViewById(R.id.tv);
        button=(Button) this.findViewById(R.id.button);
        r1 =Integer.parseInt(t1.getText().toString()) ;
        r2 =Integer.parseInt(t2.getText().toString());
        r3 =String.valueOf(r1);
        r4 =String.valueOf(r2);
        r1 =Integer.parseInt(r3);
        r2 =Integer.parseInt(r4);
        result = r1 + r2;
        tv.setText(""+result+"");
    }


}

package com.gjenterprise.canxer.btosg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void OnAddClick(View a){

        if(a.getId() == R.id.addbtn){
            EditText a1 = (EditText)findViewById(R.id.FirstNo);
            EditText a2 = (EditText)findViewById(R.id.SecondNo);

            double num1, num2;
            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = num1 + num2;

            TextView t = (TextView)findViewById(R.id.Result);
            t.setText(""+ans);
        }

    }
}

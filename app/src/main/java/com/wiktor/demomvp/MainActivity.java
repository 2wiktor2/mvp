package com.wiktor.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MyInterfaceView{

    EditText editText1;
    EditText editText2;

    TextView textView;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_1);
        editText2 = findViewById(R.id.et_2);
        textView = findViewById(R.id.tv);
        button1 = findViewById(R.id.b_1);

        button1.setOnClickListener(this);





    }

    @Override
    public void showInTextView(String s) {

    }

    @Override
    public void onClick(View v) {

    }
}

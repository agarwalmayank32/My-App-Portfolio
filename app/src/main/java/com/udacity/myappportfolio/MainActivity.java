package com.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view)
    {
        String button_text = ((Button)view).getText().toString();
        Toast.makeText(this,"This button will launch "+button_text,Toast.LENGTH_SHORT).show();
    }
}

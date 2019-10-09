package com.example.activitytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button hello1=(Button)findViewById(R.id.button1);
        Button hello2=(Button) findViewById(R.id.button2);
        hello1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,FristActivity.class);
                startActivity(intent);
            }
        });
    }
}

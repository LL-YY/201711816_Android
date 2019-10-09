package com.example.activitytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FristActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        Button hello1=(Button)findViewById(R.id.button1);
        Button hello2=(Button) findViewById(R.id.button2);
        hello1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FristActivity.this,FristActivity.class);
                startActivity(intent);
            }
        });
        hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FristActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}

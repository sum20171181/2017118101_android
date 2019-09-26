package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("activity1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Hello2=(Button) findViewById(R.id.Hello2);
        Hello2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,HelloWorld1.class);
                startActivity(intent);
            }

        });


    }
}

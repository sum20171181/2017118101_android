package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloWorld1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("activity2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button Hello1=(Button) findViewById(R.id.Hello1);
        Hello1.setOnClickListener(new View.OnClickListener(){
         public void onClick(View v){
             Intent intent=new Intent(HelloWorld1.this,MainActivity.class);
             startActivity(intent);
         }

        });
    }
}

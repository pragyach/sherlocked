package com.example.shree.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView season1 = (TextView) findViewById(R.id.textView2);
        final TextView season2 = (TextView) findViewById(R.id.textView1);
        final TextView season3 = (TextView) findViewById(R.id.textView4);

        season1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent season1Intent  =new Intent (MainActivity.this,episodes1.class);
                MainActivity.this.startActivity(season1Intent);
            }
        });
        season2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season2Intent  =new Intent (MainActivity.this,episodes2.class);
                MainActivity.this.startActivity(season2Intent);
            }
        });

        season3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season3Intent  =new Intent (MainActivity.this,episodes3.class);
                MainActivity.this.startActivity(season3Intent);
            }
        });
    }

}

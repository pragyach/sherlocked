package com.example.shree.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class episodes3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episodes3);
        final TextView sn1 = (TextView) findViewById(R.id.g1);
        final TextView sn2 = (TextView) findViewById(R.id.g2);
        final TextView sn3 = (TextView) findViewById(R.id.g3);

        sn1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent season1Intent  =new Intent (episodes3.this,lastactivity.class);
                episodes3.this.startActivity(season1Intent);
            }
        });
        sn2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season2Intent  =new Intent (episodes3.this,lastactivity.class);
                episodes3.this.startActivity(season2Intent);
            }
        });

        sn3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season3Intent  =new Intent (episodes3.this,lastactivity.class);
                episodes3.this.startActivity(season3Intent);
            }
        });
    }
}

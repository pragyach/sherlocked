package com.example.shree.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class episodes2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episodes2);
        final TextView eppp1 = (TextView) findViewById(R.id.f1);
        final TextView eppp2 = (TextView) findViewById(R.id.f2);
        final TextView eppp3 = (TextView) findViewById(R.id.f3);

        eppp1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent season1Intent  =new Intent (episodes2.this,lastactivity.class);
                episodes2.this.startActivity(season1Intent);
            }
        });
        eppp2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season2Intent  =new Intent (episodes2.this,lastactivity.class);
                episodes2.this.startActivity(season2Intent);
            }
        });

        eppp3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent season3Intent  =new Intent (episodes2.this,lastactivity.class);
                episodes2.this.startActivity(season3Intent);
            }
        });
    }
}

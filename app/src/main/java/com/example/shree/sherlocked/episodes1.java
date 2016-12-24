package com.example.shree.sherlocked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class episodes1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episodes1);
        final TextView ep1 = (TextView) findViewById(R.id.e1);
        final TextView ep2 = (TextView) findViewById(R.id.e2);
        final TextView ep3 = (TextView) findViewById(R.id.e3);

        ep1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent epp1Intent  =new Intent (episodes1.this,lastactivity.class);
                episodes1.this.startActivity(epp1Intent);
            }
        });
        ep2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent epp2Intent  =new Intent (episodes1.this,lastactivity.class);
                episodes1.this.startActivity(epp2Intent);
            }
        });

        ep3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent epp3Intent  =new Intent (episodes1.this,lastactivity.class);
                episodes1.this.startActivity(epp3Intent);
            }
        });
    }
}

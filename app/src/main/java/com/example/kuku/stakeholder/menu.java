package com.example.kuku.stakeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button1=(Button) findViewById(R.id.announcements);
        Button button2=(Button) findViewById(R.id.internships);
        Button button3=(Button) findViewById(R.id.event);

        assert button1 != null;
        assert button2 != null;
        assert button3 != null;

        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v)
            {
                Intent intent=new Intent(menu.this,pagetwo.class);
                menu.this.startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent2=new Intent(menu.this,pagethree.class);
                menu.this.startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent3=new Intent(menu.this,pageone.class);
                menu.this.startActivity(intent3);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

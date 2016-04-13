package com.example.kuku.stakeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class pagetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagetwo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();

        Button submit=(Button)findViewById(R.id.submit);

        assert submit!=null;
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }


        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

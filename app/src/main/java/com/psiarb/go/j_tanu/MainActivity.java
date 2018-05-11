package com.psiarb.go.j_tanu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vocabbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        vocabbtn = (Button) findViewById(R.id.vocab);

        vocabbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vocab = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(vocab);

            }
        });



    }
}

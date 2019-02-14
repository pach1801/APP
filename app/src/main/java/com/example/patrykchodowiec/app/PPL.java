package com.example.patrykchodowiec.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PPL extends AppCompatActivity {

    private Button push;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppl);

        push = (Button) findViewById(R.id.PUSH);
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPUSHw();
            }
        });

    }

    public void openPUSHw(){
        Intent intent = new Intent(this, PUSHW.class);
        startActivity(intent);
    }


}

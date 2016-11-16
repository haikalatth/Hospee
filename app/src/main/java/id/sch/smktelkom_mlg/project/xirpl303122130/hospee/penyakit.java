package id.sch.smktelkom_mlg.project.xirpl303122130.hospee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class penyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        findViewById(R.id.bback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        findViewById(R.id.bdiare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,diare.class));
            }
        });

        findViewById(R.id.bdemam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,demam.class));
            }
        });

        findViewById(R.id.bflu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,flu.class));
            }
        });

        findViewById(R.id.bgatal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,maag.class));
            }
        });

        findViewById(R.id.bmuntaber).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,muntaber.class));
            }
        });

        findViewById(R.id.btifus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(penyakit.this,tifus.class));
            }
        });
    }
}

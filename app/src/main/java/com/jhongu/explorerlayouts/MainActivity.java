package com.jhongu.explorerlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void irActivity2(View vista){
        Intent miIntent = new Intent(this, ConstraintActivity.class);
        startActivity(miIntent);
    }

    public void irActivity3(View vista){
        Intent miIntent = new Intent(this, TableActivity.class);
        startActivity(miIntent);
    }

    public void irActivity4(View vista){
        Intent miIntent = new Intent(this, ProfileActivity.class);
        startActivity(miIntent);
    }
}


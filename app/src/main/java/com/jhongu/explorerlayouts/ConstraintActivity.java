package com.jhongu.explorerlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
    }

    public void regresarMenu(View vista){
        Intent miIntent = new Intent(this, MainActivity.class);
        startActivity(miIntent);
    }
}
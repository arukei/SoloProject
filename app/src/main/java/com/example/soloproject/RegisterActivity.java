package com.example.soloproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        // 레지스터로 수정해야함

        spinner=(Spinner)findViewById(R.id.yearSpinner);
        adapter=ArrayAdapter.createFromResource(this,R.array.year,R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



    }
}

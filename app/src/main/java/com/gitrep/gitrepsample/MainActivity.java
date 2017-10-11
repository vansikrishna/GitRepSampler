package com.gitrep.gitrepsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.gitrep.mylibrary.DecodeJson;

public class MainActivity extends AppCompatActivity {

    final String json = "{\n" +
            "  \"name\": \"Vansi\",\n" +
            "  \"collegeName\": \"Pydah\",\n" +
            "  \"age\": 30\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        try{
            Student student = (Student) DecodeJson.decode(json, Student.class);
            if(student != null)
                Log.e("SPE_TAG", "Student not null and gives "+student.name);
            else
                Log.e("SPE_TAG", "Student is null");
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("SPE_TAG", "Student code had exception as "+e.toString());
        }
    }

}

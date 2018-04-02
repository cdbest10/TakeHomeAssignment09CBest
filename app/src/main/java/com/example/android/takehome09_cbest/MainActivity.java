package com.example.android.takehome09_cbest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Intent courseActivity = getIntent();
    Course course = (Course) courseActivity.getSerializableExtra(Keys.COURSE);
}

    public void addCourse(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_COURSE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_COURSE && resultCode == RESULT_OK) {
            Course course = (Course) data.getSerializableExtra(Keys.COURSE);

        }

    }
}
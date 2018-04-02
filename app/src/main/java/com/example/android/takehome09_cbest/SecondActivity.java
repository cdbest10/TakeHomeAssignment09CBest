package com.example.android.takehome09_cbest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SecondActivity extends AppCompatActivity {
    TextView courseName;
    TextView courseDept;
    TextView courseInstructor;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference classRef = database.getReference("Class");
    private DatabaseReference classesRef = database.getReference("Additional Classes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        courseName = (EditText) findViewById(R.id.course_name);
        courseDept = (EditText) findViewById(R.id.course_dept);
        courseInstructor = (EditText) findViewById(R.id.course_instructor);
    }


    public void submitCourse(View view) {

        String name = courseName.getEditableText().toString();
        String instructor = courseInstructor.getEditableText().toString();
        String dept = courseDept.getEditableText().toString();

        //Course course = new Course(name, instructor, dept);

        Intent addCourse = new Intent(this, MainActivity.class);

        classRef.push().setValue(new Course(name, instructor, dept));
        setResult(RESULT_OK, addCourse);
        finish();
    }

}
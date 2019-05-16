package com.example.ruangkelas;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class CreateClassActivity extends HomeActivity {
    EditText clsName;
    EditText clsSubject;
    EditText clsAuthor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_class_layout);

        clsName=(EditText) findViewById(R.id.classname);
        clsSubject=(EditText) findViewById(R.id.classSubject);
        clsAuthor=(EditText) findViewById(R.id.classAuthor);
        Button buttonSave = findViewById(R.id.saveclass);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newClsName=clsName.getText().toString();
                String newClsSubject=clsSubject.getText().toString();
                String newClsAuthor=clsAuthor.getText().toString();
                // add new item to arraylist
                listClasses.add(new Classes("" + newClsName, "" + newClsSubject, "" + newClsAuthor));
                // notify listview of data changed
                clsAdapter.notifyDataSetChanged();
            }
        });
    }
}

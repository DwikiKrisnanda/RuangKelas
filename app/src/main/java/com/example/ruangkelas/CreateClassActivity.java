package com.example.ruangkelas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateClassActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_class_layout);

        Button buttonSave = findViewById(R.id.saveclass);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateClassActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

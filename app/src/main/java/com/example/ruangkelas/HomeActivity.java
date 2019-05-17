package com.example.ruangkelas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    List<Classes> listClasses;
    public ClassesAdapter clsAdapter;
    EditText clsName;
    EditText clsSubject;
    EditText clsAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        listClasses = new ArrayList<>();
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));
        listClasses.add(new Classes("Kelas PROGMOB","Kelas Paralel","Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT"));

        showClasses();
    }

    private void showClasses() {
        RecyclerView recyclerView = findViewById(R.id.rec_class);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        clsAdapter = new ClassesAdapter(this, listClasses);
        recyclerView.setAdapter(clsAdapter);

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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_classes) {
            Intent intentClasses = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intentClasses);
        } else if (id == R.id.nav_contact) {
            Intent intentContact = new Intent(HomeActivity.this, ContactUs.class);
            startActivity(intentContact);

        } else if (id == R.id.nav_report) {
            Intent intentAbout = new Intent(HomeActivity.this, Report.class);
            startActivity(intentAbout);

        } else if (id == R.id.nav_about) {
            Intent intentAbout = new Intent(HomeActivity.this, About.class);
            startActivity(intentAbout);

        } else if (id == R.id.nav_logout) {
            Intent intentLogout = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intentLogout);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

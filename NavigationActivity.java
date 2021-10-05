package com.example.realstate;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;


import androidx.navigation.ui.AppBarConfiguration;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.realstate.databinding.ActivityNavigationBinding;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
      Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);




       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawer,
              toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
       drawer.setDrawerListener(toggle);
    toggle.syncState();

     NavigationView navigationView =(NavigationView) findViewById(R.id.nav_view);
     navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }


    @Override
    public void onBackPressed(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            if(id==R.id.view){
                Intent intent = new Intent(this,Gallery.class);
                startActivity(intent);


            }else if(id==R.id.ourlocations){
                Intent  intent = new Intent(this,MapsActivity.class);
                startActivity(intent);


            }else if (id==R.id.Testimonials){

            }else if(id==R.id.contactus){
                Intent intent = new Intent(this,ContactActivity.class);
                startActivity(intent);

            }else if(id==R.id.About){

            }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
        public void view(View view){
            Button bt1 = (Button)findViewById(R.id.view);
            Intent intent = new Intent(this,Gallery.class);
            startActivity(intent);
        }
        public void contactus(View view){
         Button bt2 = (Button)findViewById(R.id.button4);
         Intent intent = new Intent(this,ContactActivity.class);
         startActivity(intent);
        }
        public void locations(View view){
        Button bt3 =(Button)findViewById(R.id.button2);
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
        }
    }

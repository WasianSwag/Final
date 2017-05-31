package com.example.viswaguru.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View ;

public class choose extends AppCompatActivity {


     double a;
     public static Player p1 ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button normal = (Button) findViewById(R.id.button) ;
        normal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v ) {
                Intent mintent = new Intent(choose.this,
                        QuizPage.class);

                startActivity(mintent);


                p1 = new Player (0.13);

            }

        });
        Button medium = (Button) findViewById(R.id.button2) ;
        medium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v ) {
                Intent mointent = new Intent(choose.this,
                        QuizPage.class);
                startActivity(mointent);


                p1  = new Player (0.5);

            }
        });
        Button Hard = (Button) findViewById(R.id.button3) ;
        Hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v ) {
                Intent meintent = new Intent(choose.this,
                        QuizPage.class);
                startActivity(meintent);

                p1 = new Player (0.78);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

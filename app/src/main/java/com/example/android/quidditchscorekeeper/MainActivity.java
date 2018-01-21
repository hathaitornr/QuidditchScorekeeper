package com.example.android.quidditchscorekeeper;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int gScore = 0;
    int sScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button b1 = (Button) findViewById(R.id.addThirtyForGryffindor);
        b1.setOnClickListener(this);

        Button b2 = (Button) findViewById(R.id.addTenForGryffindor);
        b2.setOnClickListener(this);

        Button b3 = (Button) findViewById(R.id.addThirtyForSlytherin);
        b3.setOnClickListener(this);

        Button b4 = (Button) findViewById(R.id.addTenForSlytherin);
        b4.setOnClickListener(this);

        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Gryffindor.
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.g_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Slytherin.
     */
    public void displayForSlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.s_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            /**
             * Increase the score for Gryffindor.
             */

            case R.id.addThirtyForGryffindor:
                gScore = gScore + 30;
                displayForGryffindor(gScore);
                break;

            case R.id.addTenForGryffindor:
                gScore = gScore + 10;
                displayForGryffindor(gScore);
                break;

            /**
             * Increase the score for Slytherin.
             */

            case R.id.addThirtyForSlytherin:
                sScore = sScore + 30;
                displayForSlytherin(sScore);
                break;

            case R.id.addTenForSlytherin:
                sScore = sScore + 10;
                displayForSlytherin(sScore);
                break;

            /**
             * Resets the score for both teams back to 0.
             */

            case R.id.reset:
                gScore = 0;
                sScore = 0;
                displayForGryffindor(gScore);
                displayForSlytherin(sScore);
                break;

        }
    }
}


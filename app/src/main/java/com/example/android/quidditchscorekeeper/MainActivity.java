package com.example.android.quidditchscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gScore = 0;
    int sScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
     * Increase the score for Gryffindor.
     */
    public void addThirtyForGryffindor(View v) {
        gScore = gScore + 30;
        displayForGryffindor(gScore);
    }
    
    public void addTenForGryffindor(View v) {
        gScore = gScore + 10;
        displayForGryffindor(gScore);
    }
    
    /**
     * Increase the score for Slytherin.
     */
    public void addThirtyForSlytherin(View v) {
        sScore = sScore + 30;
        displayForSlytherin(sScore);
    }

    public void addTenForSlytherin(View v) {
        sScore = sScore + 10;
        displayForSlytherin(sScore);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        gScore = 0;
        sScore = 0;
        displayForGryffindor(gScore);
        displayForSlytherin(sScore);
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
}

